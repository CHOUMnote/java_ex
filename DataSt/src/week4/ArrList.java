package week4;

import java.util.NoSuchElementException;

public class ArrList<E> {
	private E a[];
	private int size;
	public ArrList(){
		size = 0;
		a = (E[])new Object[1];
	}
	
	public E peek(int k) {
		if(size == 0 || size <= k) {
			throw new NoSuchElementException();
		}
		return a[k];
	}
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else
			return false;
	}
	public void insertLast(E newItem) {
		if(size == a.length)
			resize(2*a.length);
		a[size++] = newItem;
	}
	public void insert(E newItem) {
		insertLast(newItem);
	}
	public void insert(E newItem, int k) {
		if(size == a.length)
			resize(2*a.length);
		for(int i = size-1; i >= k; i--)
			a[i+1] = a[i];
		a[k] = newItem;
		size++;
	}
	public void resize(int newSize) {
		E[] t = (E[])new Object[newSize];
		for(int i = 0; i < size; i++) 
			t[i] = a[i];
		a = t;
	}
	public E delete(int k) {
		if(isEmpty())
			throw new NoSuchElementException();
		E item = a[k];
		for(int i = k; i < size-1; i++)
			a[i] = a[i+1];
		size--;
		if(size > 0 && size <= a.length/4)
			resize(a.length/2);
		return item;
	}
	public void print() {
		for(int i = 0; i < a.length; i++){
			if(i < size)
				System.out.printf(a[i] +"\t");
			else
				System.out.printf("null\t");
		}
		System.out.println();
	}
	public int getSize() {
		return size;
	}
	public E[] getA() {
		return a;
	}
}
