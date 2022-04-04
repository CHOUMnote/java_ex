package week4;

public class ArrListPoly extends ArrList<Integer>{
	private int x;
	
	public void setPoly(int x) {
		this.x = x;
	}
	public void setPoly(int x, int[] arr) {
		this.x = x;
		for(int i = 0; i < arr.length; i++)
			insert(arr[i]);
	}
	public ArrListPoly sumpoly(ArrListPoly p) {
		ArrListPoly p3 = new ArrListPoly();
		int higherX = Math.max(this.getSize(), p.getSize());
		int lowerX = Math.min(this.getSize(), p.getSize());
		
		if(this.getSize() == p.getSize()) 
			for(int i = 0; i < higherX; i++) 
				p3.insert(this.peek(i)+p.peek(i));
		else {
			for(int i = 0; i < lowerX; i++)
				p3.insert(this.peek(i)+p.peek(i));
			if(this.getSize() > p.getSize())
				for(int i = lowerX; i < higherX; i++)
					p3.insert(peek(i));
			if(this.getSize() < p.getSize())
				for(int i = lowerX; i < higherX; i++)
					p3.insert(p.peek(i));
		}
		p3.setPoly(p3.getSize()-1);
		return p3;
	}
	public int getHighestDegree() {
		return x;
	}
}
