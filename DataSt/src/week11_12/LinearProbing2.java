package week11_12;

public class LinearProbing2 <K,V>{
	private int M = 13; //���̺� ũ��
	private K[] a = (K[])new Object[M];
	private V[] d = (V[])new Object[M];
	public final K NULL = (K)new Object();
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public void put(K key) {
		put(key,(V)key);
	}
	public void put(K key, V data) {
		int initialpos=hash(key);	//�ʱ� ��ġ
		int i = initialpos, j = 1;	//��ȯ ��ġ
		do {
			if(a[i] == null || a[i] == NULL) {	//���� ��ġ ã��
				a[i] = key;
				d[i] = data;
			}
			if(a[i].equals(key)) {	//���� Ű�� => value�� ��ȯ
				d[i] = data;
				return;
			}
			i = (initialpos + j++) % M;
		}while(i!=initialpos);
	}
	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if(a[i].equals(key)) 
				return d[i];
			i = (initialpos + j++) % M;
		}while(a[i] != null && i != initialpos );
		return null;
	}
	public void print() {
		System.out.println("�ؽ� ���̺�");
		for(int i = 0; i < M; i++) System.out.print("\t"+i);
		System.out.println();
		for(int i = 0; i < M; i++) System.out.print("\t"+a[i]);
	}
	public V delete(K key) {
		V delItem = null;
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if(a[i].equals(key)) {
				delItem = d[i];
				a[i] = (K)NULL;
				d[i] = null;
				break;
			}
			i = (initialpos+j++) % M;
		}while(a[i] != NULL && a[i]!=null && i!=initialpos);
		return delItem;
	}
}
