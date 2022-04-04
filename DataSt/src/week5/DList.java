package week5;
import java.util.NoSuchElementException;
public class DList <E>{
	protected DNode head, tail;
	protected int size;
	public DList() {
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null);
		head.setNext(tail);
		size = 0;
	}
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode<E>(newItem, p, t);
		p.setNext(newNode);
		t.setPrevious(newNode);
		size++;
	}
	public void delete(DNode x) {
		if(x == null) throw new NoSuchElementException();
		if(size <= 0) throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
	public void print() {
		DNode a = head.getNext();
		if(size == 0) System.out.println("리스트 비어있음");
		for(int i = 0; i < size; i++) {
			System.out.print(a.getItem()+"\t");
			a = a.getNext();
		}
		System.out.println();
	}
	public int getSize() {
		return size;
	}
}
