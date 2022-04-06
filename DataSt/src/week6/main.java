package week6;

public class main {
	public static void main(String[] args) {
		/* 1번
		ArrayStack<String> stack = new ArrayStack<>();
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
		*/
		/* 2번
		ListStack<String> stack = new ListStack<>();
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
		*/
		/* 3번
		ArrayPlus stack = new ArrayPlus();
		String str1 = "(ant+bee)*crab+{[ant*food]+(offset)}/gas";
		String str2 = "(ant+bee)*crab+[ant*food]+(offset)}/gas";
		boolean a = stack.checkParentheses(str1);
		if(a)
			System.out.println(str1+" : True");
		else 
			System.out.println(str1+" : False");
		a = stack.checkParentheses(str2);
		if(a)
			System.out.println(str2+" : True");
		else 
			System.out.println(str2+" : False");
		*/
		/* 4번
		ArrayPlus stack = new ArrayPlus();
		String s1 = "redivider";
		String s2 = "redder";
		String s3 = "a";
		String s4 = "abbd";
		String s5 = "abcde";
		if(stack.checkPalindrome(s1))
			System.out.println(s1+" : True");
		else 
			System.out.println(s1+" : False");
		if(stack.checkPalindrome(s2))
			System.out.println(s2+" : True");
		else 
			System.out.println(s2+" : False");
		if(stack.checkPalindrome(s3))
			System.out.println(s3+" : True");
		else 
			System.out.println(s3+" : False");
		if(stack.checkPalindrome(s4))
			System.out.println(s4+" : True");
		else 
			System.out.println(s4+" : False");
		if(stack.checkPalindrome(s5))
			System.out.println(s5+" : True");
		else 
			System.out.println(s5+" : False");
		*/
		/*	5번
		ListPlus stack = new ListPlus();
		String s1 = "A*(B+C/D)";
		String s2 = "(A+B)*(C-D)";
		System.out.println(stack.getPostEq(s1));
		System.out.println(stack.getPostEq(s2));
		*/
		/*	6번
		ListPlus stack = new ListPlus();
		String[] s1 = {"8", "37", "13", "+", "40", "-", "*"};
		String[] s2 = {"20", "-10", "3", "+", "*"};
		System.out.println(stack.calc(s1));
		System.out.println(stack.calc(s2));
		*/
	}
}
