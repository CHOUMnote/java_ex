package week10;

public class BSTTest {

	public static void main(String[] args) {
		/* 1번
		BST<Integer, Integer> bst1 = new BST<Integer, Integer>(10, 10);
		Integer[] arr = {60, 25, 30 , 20, 50, 45, 70, 40, 35};
		for(int i = 0; i< arr.length; i++)
			bst1.put(arr[i], arr[i]);
		bst1.print();
		System.out.print("Searching for 45 yields : ");	System.out.println(bst1.get(45));
		bst1.put(45, 99);
		System.out.print("Searching for 45 yields : ");	System.out.println(bst1.get(45));
		System.out.print("Min value : ");	System.out.println(bst1.min());
		bst1.deleteMin();
		System.out.print("Min value : ");	System.out.println(bst1.min());
		bst1.delete(25);	bst1.delete(35);	bst1.delete(45);
		bst1.print();
		*/
		/* 2번
		BST<Integer, Integer> bst2 = new BST<Integer, Integer>(10, 10);
		Integer[] arr = {60, 25, 30 , 20, 50, 45, 70, 40, 35};
		for(int i = 0; i< arr.length; i++)
			bst2.put(arr[i], arr[i]);
		bst2.print();
		for(int i = 0; i < 3; i ++) {
			bst2.deleteMax();
			bst2.print();
		}
		*/
		/* 3번
		BST<Integer, Integer> bst3 = new BST<Integer, Integer>(10, 10);
		Integer[] arr = {60, 25, 30 , 20, 50, 45, 70, 40, 35};
		for(int i = 0; i< arr.length; i++)
			bst3.put(arr[i], arr[i]);
		bst3.print();
		for(int i=0;i<5;i++) {
			System.out.print(i+1+"번째로 작은 값 : "+bst3.kthSmallest(i));
		}
		*/
		/* 4번
		BST<Integer, Integer> bst4 = new BST<>();
		BST<Integer, Integer> bst5 = new BST<>();
		
		Node<Integer, Integer> n1 = new Node<>(50, 50);
		Node<Integer, Integer> n2 = new Node<>(50, 50);
		Node<Integer, Integer> a = new Node<>(25, 25);
		Node<Integer, Integer> b = new Node<>(75, 75);
		Node<Integer, Integer> c = new Node<>(75, 75);
		
		a.setLeft(new Node<Integer, Integer>(10,10));	a.setRight(new Node<Integer, Integer>(30,30));
		b.setLeft(new Node<Integer, Integer>(60,60));	b.setRight(new Node<Integer, Integer>(80,80));
		n1.setLeft(a);	n1.setRight(b);
		bst4.setRoot(n1);

		c.setLeft(new Node<Integer, Integer>(80,80));	c.setRight(new Node<Integer, Integer>(60,60));
		n2.setLeft(a);	n2.setRight(c);
		bst5.setRoot(n2);

		System.out.print("bst4 : ");	bst4.print();
		System.out.println("bst4 이진 탐색 트리 유효성 검사 : "+bst4.checkBST());
		System.out.print("bst5 : ");	bst5.print();
		System.out.println("bst5 이진 탐색 트리 유효성 검사 : "+bst5.checkBST());
		*/
	}
}
