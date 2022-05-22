package week11_12;

public class Chaining<K, V> {
	private int M = 13;
	private Node[] a = new Node[M];
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
				System.out.print("["+(int)x.getKey()+", "+(String)x.getData()+"]");
			}
			System.out.println();
		}
	}
}
