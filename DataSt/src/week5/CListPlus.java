package week5;

public class CListPlus extends CList<Integer>{
	public void rotateLeft(int n) {
		Node nd;
		for(int i = 0; i < n; i++) {
			nd = delete();
			insertLast((int)nd.getItem());
		}
	}
	
	public void rotateRight(int n) {
		if(getSize() == 0) return;
		
		int[] list = new int[getSize()-1];
		for(int i = 0; i < n; i++) 
			for(int j = 0; j < getSize()-1; j++) 
				insertLast((int)delete().getItem());
	}
}
