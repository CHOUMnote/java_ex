package week3;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ū ���� ������ �Է��ϼ���: ");
		int num = sc.nextInt();
		boolean b = true;
		
		for(int i = 2; i <= num-1; i++) { //1,2,3 �� �Ҽ�
			if(num%i==0) {
				b=false;
				break;
			}
		}
		
		if(b)
			System.out.println(num+"��(��) �Ҽ��Դϴ�");
		else
			System.out.println(num+"��(��) �Ҽ��� �ƴմϴ�");
	}
}
