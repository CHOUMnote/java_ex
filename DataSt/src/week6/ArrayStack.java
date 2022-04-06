package week6;
import java.util.EmptyStackException;

public class ArrayStack<E> {
	private E s[];
	private int top;
	public ArrayStack() {
		s = (E[])new Object[1];
		top = -1;
	}
	public int getSize() {
		return top+1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public E peek() {
		if(isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	public void push(E newItem) {
		if(getSize() == s.length)
			resize(2*s.length);
		s[++top] = newItem;
	}
	public E pop() {
		if(isEmpty()) throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if(getSize() == s.length/4)
			resize(s.length/2);
		return item;
	}
	public void resize(int n) {
		if(n == 0)
			return;
		Object[] t = new Object[n];
		for(int i = 0; i < getSize(); i++) 
			t[i] = s[i];
		s = (E[]) t;
	}
	public void print() {
		for(int i = 0; i<getSize(); i++) {
			System.out.print(s[i]+"   ");
		}System.out.println();
	}
}
