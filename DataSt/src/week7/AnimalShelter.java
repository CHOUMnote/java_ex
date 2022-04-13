package week7;

public class AnimalShelter {
	ListQueue<Animal> result = new ListQueue<>();
	Animal cat = new Cat("s");
	public void enter(Animal a) {
		result.add(a);
	}
	public Animal adoptAny() {
		return result.remove();
	}
	public Animal adoptDog() {
		Animal d = null;
		Animal temp;
		int size = result.getSize();
		for(int i = 0; i < size; i++) {
			temp = result.remove();
			if(d == null && temp instanceof Dog) d = temp; //처음 개를 찾기 때무에 d==null일대
			else result.add(temp);
		}
		return d;
	}
	public Animal adoptCat() {
		Animal c = null;
		Animal temp;
		int size = result.getSize();
		for(int i = 0; i < size; i++) {
			temp = result.remove();
			if(c == null && temp instanceof Cat) c = temp; //처음 냥이를 찾기 때무에 \c==null일대
			else result.add(temp);
		}
		return c;
	}
	
	public void print() {
		int size = result.getSize();
		Node a = result.getFront();
		for(int i = 0; i < size; i++) {
			if(a.getItem() instanceof Dog)
				System.out.print("(개):"+((Animal) a.getItem()).getName()+"  ");
			else
				System.out.print("(고양이):"+((Animal) a.getItem()).getName()+"  ");
			a = a.getNext();
		}
		System.out.println();
	}
}