package week11_12;

import week11_12.Chaining.Node;

public class Upgrade_Chaining<K, V>{
	private int M = 5;
	private Node[] a = new Node[M];
	public int size = 0; //maxsize
	public static class Node{
		public Object key;
		public Object data;
		public Node next;
		public Node(Object newKey, Object newData, Node ref) {
			key = newKey;
			data = newData;
			next = ref;
		}
		public Object getKey() {return key;}
		public Object getData() {return data;}
	}
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public V get(K key) {
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next)
			if(key.equals(x.getKey())) return (V)x.getData();
		return null;
	}
	public void put(K key, V data) {
		int i = hash(key);
		for(Node x = a[i]; x != null; x = x.next) 
			if(key.equals(x.getKey())) {
				x.data = data;
				return;
			}
		a[i] = new Node(key, data, a[i]);
		size++;
		check_and_rehash();
	}
	public V delete(K key) {
		int i = hash(key);
		V del = null;
		if(a[i] != null && a[i].getKey().equals(key)) {
			del = (V)a[i].getData();
			a[i] = a[i].next;
		}
		else
			for(Node x = a[i]; x!=null; x = x.next) {
				if(x.next != null && x.next.getKey().equals(key)) {
					del = (V)x.getData();
					x.next = x.next.next;
					break;
				}
			}
		size--;
		check_and_rehash();
		return del;
	}
	private void rehash(Node n) {
		int i = hash((K)n.key);
		for(Node x = a[i]; x != null; x = x.next) 
			if(n.key.equals(x.getKey())) {
				x.data = n.data;
				return;
			}
		a[i] = new Node(n.key, n.data, a[i]);
	}
	private void check_and_rehash() {
		if(size/(double)M > 0.75) {
			//2배 확장
			M=M*2;
			Node delNode[] = a;
			a = new Node[M];
			for(int i = 0; i<delNode.length; i++) {
				if(delNode[i]==null)
					continue;
				for(Node x = delNode[i]; x!=null; x=x.next) 
					rehash(x);
			}
			System.out.println("테이블의 사이즈를"+M/2+"에서"+M+"로 변경합니다");
			return;
		}
		else if(M > 5 && size/(double)M < 0.25) {
			//반으로 축소
			M=M/2;
			Node delNode[] = a;
			a = new Node[M];
			for(int i = 0; i<delNode.length; i++) {
				if(delNode[i] == null)
					continue;
				for(Node x = delNode[i]; x!=null; x=x.next) 
					rehash(x);
			}
			System.out.println("테이블의 사이즈를"+M*2+"에서"+M+"로 변경합니다");
			return;
		}
		System.out.println("테이블의 사이즈를 변경하지 않습니다.");
	}
	public void print() {
		System.out.println("해시 테이블:");
		for(int i = 0; i<a.length; i++) {
			System.out.print(i);
			if(a[i] == null) {
				System.out.println();
				continue;
			}
			for(Node x = a[i]; x!=null; x=x.next) {
				System.out.print("-->");
				System.out.print("["+(int)x.getKey()+", "+(Integer)x.getData()+"]");
			}
			System.out.println();
		}
	}
}
