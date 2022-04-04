package week5;

public class DListPlus extends DList<Integer>{
	
	public int add(DList dl2) {
		
		String str = "";
		DNode dn = head.getNext();
		int size = getSize();
		int a,b;
		for(int i = 0; i < size; i++) {
			str += (int)dn.getItem();
			dn = dn.getNext();
		}
		a = Integer.parseInt(str);
		str = "";
		dn = dl2.head.getNext();
		size = dl2.getSize();
		for(int i = 0; i < size; i++) {
			str += (int)dn.getItem();
			dn = dn.getNext();
		}
		b = Integer.parseInt(str);
		return a+b;	
	}

}
