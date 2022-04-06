package week5;

public class LinkedListTest {
	public static void main(String[] args) {
		/*	 SList 실험
		SList<String> s = new SList<String>();
		s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		s.print();
		System.out.println(": s의 길이 = "+s.getSize()+"\n");
		System.out.println("체리가\t"+s.search("cherry")+"번째에 있다.");
		System.out.println("키위가\t"+s.search("kiwi")+"번째에 있다.");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이 = "+s.getSize()+"\n");
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이" + t.getSize());
		*/
		/*	DList실험
		DList<String> s = new DList<String>();
		s.insertAfter(s.head, "apple");
		s.insertBefore(s.tail, "orange");
		s.insertBefore(s.tail, "cherry");
		s.insertAfter(s.head.getNext(), "pear");
		s.print(); System.out.println();
		
		s.delete(s.tail.getPrevious());
		s.print(); System.out.println();
		
		s.insertBefore(s.tail, "grape");
		s.print(); System.out.println();
		s.delete(s.head.getNext()); s.print(); s.delete(s.head.getNext()); s.print();
		s.delete(s.head.getNext()); s.print(); s.delete(s.head.getNext()); s.print();
		*/
		/*	CList 실험
		CList<String> s = new CList<String>();
		s.insert("pear");	s.insert("cherry");
		s.insert("orange");	s.insert("apple");
		s.print();
		System.out.print(": s의 길이 = " + s.getSize()+"\n");
		
		s.delete();
		s.print();
		System.out.print(": s의 길이 = " + s.getSize()+"\n");
		*/
		/*	4번
		SListPlus s = new SListPlus();
		int[] a = {7,11,4,1,8};
		int[] b = {5,2,8,7,13};
		s.setAndOrderNodes(a);
		s.print();
		System.out.println();
		s.setAndOrderNodes(b);
		s.print();
		*/
		/*	4번 join메서드
		SListPlus s1 = new SListPlus();
		SListPlus s2 = new SListPlus();
		int[] a = {7,11,4,1,8};
		int[] b = {5,2,8,7,13};
		s1.setAndOrderNodes(a);
		s1.print();
		System.out.println();
		s2.setAndOrderNodes(b);
		s2.print();
		System.out.println();
		s1.join(s2);
		s1.print();
		*/
		/*	5번
		SListPlus s1 = new SListPlus();
		int[] a = {7,11,4,1,8};
		s1.setAndOrderNodes(a);
		s1.print(); System.out.println();
		s1.reverse();
		s1.print();
		*/
		/*	6번
		DListPlus d1 = new DListPlus();
		DListPlus d2 = new DListPlus();
		d1.insertAfter(d1.head, 3);
		d1.insertAfter(d1.head, 2);
		d1.insertAfter(d1.head, 1);
		d2.insertAfter(d2.head, 9);
		d2.insertAfter(d2.head, 8);
		d2.insertAfter(d2.head, 7);
		d2.insertAfter(d2.head, 6);
		System.out.print("d1 = ");d1.print();
		System.out.print("d2 = ");d2.print();
		int add1 = d1.add(d2);
		int add2 = d2.add(d1);
		System.out.println("d1.add(d2) = "+add1 + "\nd2.add(d1) = "+add2);
		*/
		
		CListPlus c1 = new CListPlus();
		CListPlus c2 = new CListPlus();
		c1.insert(4);	c2.insert(4);
		c1.insert(3);	c2.insert(3);
		c1.insert(2);	c2.insert(2);
		c1.insert(1);	c2.insert(1);
		System.out.print("c1 : "); c1.print();
		c1.rotateLeft(5);
		System.out.print("c1.rotateleft(1) : "); c1.print(); System.out.println();
		System.out.print("c2 : "); c2.print();
		c2.rotateRight(5);
		System.out.print("c2.rotateRight(1) : "); c2.print();
		
		
	}
}
