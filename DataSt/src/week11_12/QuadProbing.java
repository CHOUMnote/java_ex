package week11_12;

public class QuadProbing<K, V> {
	private int M = 13; //테이블 크기
	private int N = 0;	//테이블 아이템 size
	private K[] a = (K[])new Object[M];
	private V[] d = (V[])new Object[M];

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public void put(K key, V data) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if(a[i] == null) {
				a[i] = key;
				d[i] = data;
				N++;	
				return;
			}
			i = (initialpos +j*j++) % M;
		}while(N<M);
	}
	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		while(a[i] != null) {
			if(a[i].equals(key)) return d[i];
			i = (initialpos + j*j++) % M;
		}
		return null;
	}
	public void print() {
		System.out.println("해시 테이블");
		for(int i = 0; i < M; i++) System.out.print("\t"+i);
		System.out.println();
		for(int i = 0; i < M; i++) System.out.print("\t"+a[i]);
		System.out.println();
	}
}
