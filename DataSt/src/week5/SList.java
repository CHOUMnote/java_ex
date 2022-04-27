package week5;
import java.util.NoSuchElementException;
public class SList <E> {
	protected Node head;
	private int size;
	public SList() {
		head = null;
		size = 0;
	}
	public int search(E target) {
		Node p = head;
		for(int i = 0; i < size; i++) {
			if(target == p.getItem()) return i;
			p = p.getNext();
		}
		return -1;
	}
	public void insertFront(E newItem) {
		head = new Node(newItem,head);
		size++;
	}
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	public void deleteFront() {
		if(size == 0) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	public void deleteAfter(Node p) {
		if(p == null) throw new NoSuchElementException();
		if(p.getNext()!=null) {
			p.setNext(p.getNext().getNext());
			size--;
		}
	}
	public void print() {
		Node a = head;
		for(int i = 0; i < size; i++) {
			System.out.print(a.getItem()+"\t");
			a = a.getNext();
		}
	}
	public int getSize() {
		return size;
	}
}
