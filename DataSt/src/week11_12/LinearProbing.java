package week11_12;

public class LinearProbing <K,V>{	//key value
	private int M = 13; //���̺� ũ��
	private K[] a = (K[])new Object[M];
	private V[] d = (V[])new Object[M];
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public void put(K key, V data) {
		int initialpos=hash(key);	//�ʱ� ��ġ
		int i = initialpos, j = 1;	//��ȯ ��ġ
		do {
			if(a[i] == null) {	//���� ��ġ ã��
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
}
