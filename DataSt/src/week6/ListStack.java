package week6;
import java.util.EmptyStackException;
public class ListStack<E> {
	private Node<E> top;
	private int size;
	public ListStack() {
		top = null;
		size = 0;
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return top.getItem();
	}
	public void push(E newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}
	public E pop() {
		if(isEmpty()) throw new EmptyStackException();
		E topItem = top.getItem();
		top = top.getNext();
		size--;
		return topItem;
	}
	public void print() {
		Node n = top;
		for(int i = 0; i < size; i++) {
			System.out.print(n.getItem()+"   ");
			n = n.getNext();
		}System.out.println();
	}
	
	
}
