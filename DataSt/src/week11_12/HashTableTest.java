package week11_12;

public class HashTableTest {
	public static void main(String[] args) {
		/*	1번
		LinearProbing<Integer, String> lp = new LinearProbing<>();
		lp.put(25, "grape"); lp.put(37, "apple"); lp.put(18, "banana"); lp.put(55, "cherry"); 
		lp.put(22, "mango"); lp.put(35, "lime"); lp.put(50, "orange"); lp.put(63, "watermelon");
		System.out.println("50의 data = "+lp.get(50));
		System.out.println("63의 data = "+lp.get(63));
		lp.print();
		*/
		/*	2번
		LinearProbing2<Integer, Integer> lp2 = new LinearProbing2<>();
		lp2.put(25); lp2.put(37); lp2.put(18); lp2.put(55); 
		lp2.put(22); lp2.put(35); lp2.put(50); lp2.put(63); 
		lp2.print();	System.out.println();
		System.out.println(lp2.get(63)+"을/를 찾았습니다!");
		lp2.delete(50);
		lp2.print();	System.out.println();
		System.out.println(lp2.get(63)+"을/를 찾았습니다!");
		*/
		/*	3번
		QuadProbing<Integer, String> qp = new QuadProbing<>();
		qp.put(25, "grape"); qp.put(37, "apple"); qp.put(18, "banana"); qp.put(55, "cherry"); 
		qp.put(22, "mango"); qp.put(35, "lime"); qp.put(50, "orange"); qp.put(63, "watermelon");
		System.out.println("50의 data = "+qp.get(50));
		System.out.println("63의 data = "+qp.get(63));
		qp.print();
		*/
		/*	4번
		RandProbing<Integer, String> rp = new RandProbing<>();
		rp.put(25, "grape"); rp.put(37, "apple"); rp.put(18, "banana"); rp.put(55, "cherry"); 
		rp.put(22, "mango"); rp.put(35, "lime"); rp.put(50, "orange"); rp.put(63, "watermelon");
		System.out.println("50의 data = "+rp.get(50));
		System.out.println("63의 data = "+rp.get(63));
		rp.print();
		*/
		/*	5번
		DoubleHashing<Integer, String> dh = new DoubleHashing<>();
		dh.put(25, "grape"); dh.put(37, "apple"); dh.put(18, "banana"); dh.put(55, "cherry"); 
		dh.put(22, "mango"); dh.put(35, "lime"); dh.put(50, "orange"); dh.put(63, "watermelon");
		System.out.println("50의 data = "+dh.get(50));
		System.out.println("63의 data = "+dh.get(63));
		dh.print();
		*/
		/*	6번
		Chaining<Integer, String> ch = new Chaining<>();
		ch.put(25, "grape"); ch.put(37, "apple"); ch.put(18, "banana"); ch.put(55, "cherry"); 
		ch.put(22, "mango"); ch.put(35, "lime"); ch.put(50, "orange"); ch.put(63, "watermelon");
		System.out.println("탐색 결과");
		System.out.println("50의 data = "+ch.get(50));
		System.out.println("63의 data = "+ch.get(63));
		System.out.println("37의 data = "+ch.get(37));
		System.out.println("22의 data = "+ch.get(22));
		System.out.println();
		ch.print();
		*/
		/*	7번
		Upgrade_Chaining<Integer, Integer> ch = new Upgrade_Chaining<Integer, Integer>();
		for(int i=0;i<20;i++) {ch.put(i,i);}
		ch.print();
		for(int i=0;i<20;i++) ch.delete(i);
		ch.print();
		*/
		
		creativeSolv cs = new creativeSolv();
		int[] arr1 = {1,2,3,9};
		System.out.println("결과 : "+cs.findTwoNum(arr1,8).toString());
		int[] arr2 = {1,2,4,4};
		System.out.println("결과 : "+cs.findTwoNum(arr2,8).toString());
	}																		
}
