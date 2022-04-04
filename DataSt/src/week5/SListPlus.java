package week5;

public class SListPlus extends SList<Integer>{
	Node pivot1;
	Node pivot2;
	
	public void setAndOrderNodes(int[] arr) {
		int a = getSize();
		for(int i = 0; i < a; i++) {
			deleteFront();
		}
		
		 
			
		for(int i = 0; i < arr.length; i++) { //���ĵ� ����		
			pivot1 = head;
			pivot2 = null;
			if(i == 0) {
				insertFront(arr[i]);
				continue;
			}
			
			if(arr[i] <= (int)head.getItem()) {		//��庸�� ���� ��
				insertFront(arr[i]);
				continue;
			}
			if(pivot1.getNext() == null) {			//��庸�� ū ���
				insertAfter(arr[i], pivot1);
				continue;
			}
			if(arr[i] > (int)head.getItem()) {	//��庸�� Ŭ�� + null�� �ƴҶ�
				pivot1 = head.getNext();	 	//��
				pivot2 = head;					//��
				for(int k = 0; k < getSize(); k++) {
					if(pivot1 == null) {
						insertAfter(arr[i], pivot2);
						break;
					}
					if(arr[i] <= (int)pivot1.getItem()) {
						insertAfter(arr[i], pivot2);
						break;
					}
					pivot2 = pivot1;
					pivot1 = pivot1.getNext();
				}
			}
		}
	}
	public void join(SListPlus s2) {
		Node a = head;
		int size = s2.getSize() + this.getSize();
		int[] list = new int[size];
		
		for(int i = 0; i < this.getSize(); i++) {
			list[i] = (int)a.getItem();
			a = a.getNext(); }
		a = s2.head;
		for(int j = this.getSize(); j < size; j++) {
			list[j] = (int)a.getItem();
			a = a.getNext(); }
		
		setAndOrderNodes(list);
	}
	public void reverse() {
		int size = getSize();
		int[] list = new int[size];
		Node n = head;
		for(int i = 0; i < size; i++) {
			list[i] = (int)n.getItem();
			n=n.getNext();
		}
		reset();
		for(int i = 0; i < list.length; i++) {
			insertFront(list[i]);
		}
	}
	public void reset() {
		int a = getSize();
		for(int i = 0; i < a; i++) {
			deleteFront();
		}
	}
}