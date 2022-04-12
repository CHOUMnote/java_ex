package week7;
import java.util.NoSuchElementException;

import week6.ArrayPlus;
import week6.ArrayStack;
public class ListQueue<E> {
	private Node<E> front, rear;
	private int size;
	public ListQueue() {
		size = 0;
		front = rear = null;
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return getSize() == 0;
	}
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if(isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if(isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	public void print() {
		Node a = front;
		for(int i = 0; i<size; i++) {
			System.out.print(a.getItem()+"  ");
			a = a.getNext();
		}
		System.out.println();
	}
	public Node getFront() {
		if(isEmpty()) throw new NoSuchElementException();
		return front;
	}
	
	
	
	public double avg() {
		double sum = 0.0;
		Integer temp;
		for(int i = 0; i<getSize(); i++) {
			temp = (int)remove();
			add((E)temp);
			sum+= temp;
		}
		return sum/size;
	}
	public void reverse() {
		ArrayStack<E> stack = new ArrayStack<>();
		int s = getSize();
		for(int i = 0; i<s; i++) 
			stack.push(remove());
		for(int i = 0; i<s; i++) 
			add(stack.pop());
	}
}
