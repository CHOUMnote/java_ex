package week6;

import java.util.EmptyStackException;

public class ArrayPlus extends ArrayStack<String>{
	public boolean checkParentheses(String s) {
		char c;
		for(int i = 0; i < s.length(); i++) {			
			c = s.charAt(i);
			if(c == '{' || c == '(' || c == '[') { //���� ��ȣ �ֱ�
				push(c+"");
			}
			try {	//�׳� ��ȣ ������ ó��
				if(c == '}') {
					if(pop().equals("{"+"") == false)
						return false;
				}
				if(c == ']') {
					if(pop().equals("["+"") == false)
						return false;
				}
				if(c == ')') {
					if(pop().equals("("+"") == false)
						return false;
				}
			}catch(EmptyStackException e) {
				return false;
			}
		}
		if(getSize() == 0) //���� ��ȣ�� ���� ������...
			return true;
		else
			return false;
	}
	public boolean checkPalindrome(String s) {
		int a = s.length();
		if(a%2 == 0) { //¦�� ���ڸ�
			for(int i = 0; i<a/2; i++) 
				push(s.charAt(i)+"");
			for(int i = a/2; i<a; i++)
				if(pop().equals(s.charAt(i)+"") == false)
					return false;
		}
		if(a%2 != 0) {	//Ȧ����
			for(int i = 0; i < a/2;i++)
				push(s.charAt(i)+"");
			for(int i = a/2+1; i<a; i++)
				if(pop().equals(s.charAt(i)+"") == false)
					return false;
		}
		return true;
	}
}
