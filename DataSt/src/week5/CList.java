package week5;
import java.util.NoSuchElementException;
public class CList<E> {
	private Node last;
	private int size;
	public CList() {
		last = null;
		size = 0;
	}
	public void insert(E newItem){
		Node newNode = new Node(newItem, null);
		if(last == null) {
			newNode.setNext(newNode);
			last = newNode;
			}
		else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}
	public Node delete() {
		if(isEmpty()) throw new NoSuchElementException();
		Node x = last.getNext();
		if(x == last) last = null;
		else {
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x; 
	}
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
	public void print() {
		Node a = last.getNext();
		for(int i = 0; i < size; i++) {
			System.out.print(a.getItem() + "\t");
			a = a.getNext();
		}
	}
	public int getSize() {
		return size;
	}
	public Node getLast() {
		return last;
	}
	public void insertLast(E newItem) {
		Node newNode = new Node(newItem, last.getNext());
		if(last == null) {
			newNode.setNext(newNode);
			last = newNode;
			}
		else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
			last = newNode;
		}
		size++;
	}
}
