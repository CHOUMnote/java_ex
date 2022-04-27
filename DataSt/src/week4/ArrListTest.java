package week4;

public class ArrListTest {
	public static void printPolyEq(ArrListPoly p, int nTabs) {
		for(int i = 0; i < nTabs; i++)
			System.out.printf("\t");
		for(int i = p.getHighestDegree(); i >= 0; i--) {
			System.out.printf("%+d x%d\t",p.peek(i),i);}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		ArrList<String> s = new ArrList<String>();
		s.insert("apple");		s.print();		s.insert("orange");		s.print();
		s.insert("cherry");		s.print();		s.insert("pear");		s.print();
		s.insert("grape", 1);	s.print();		s.insert("lemon",4);	s.print();
		s.insert("kiwi");		s.print();
		s.delete(4);	s.print();	s.delete(0);	s.print();
		s.delete(0);	s.print();	s.delete(3);	s.print();
		s.delete(0);	s.print();	
		
		System.out.println("1번재 항목은 "+s.peek(1)+"이다."); System.out.println();
		*/
		
		/*
		ArrListPoly p1 = new ArrListPoly();
		int[] poly1 = {9,0,-3,0,5};
		int p1HighestDegree = poly1.length-1;
		p1.setPoly(p1HighestDegree, poly1);
		printPolyEq(p1, 1);
		
		ArrListPoly p2 = new ArrListPoly();
		int[] poly2 = {2, 0, 4};
		int p2HighestDegree = poly2.length-1;
		p2.setPoly(p2HighestDegree, poly2);
		printPolyEq(p2, 3);
		
		ArrListPoly p3 = p1.sumpoly(p2);
		printPolyEq(p3, 1);
		*/
	}
}
