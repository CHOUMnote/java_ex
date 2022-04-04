package week3;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 큰 양의 정수를 입력하세요: ");
		int num = sc.nextInt();
		boolean b = true;
		
		for(int i = 2; i <= num-1; i++) { //1,2,3 은 소수
			if(num%i==0) {
				b=false;
				break;
			}
		}
		
		if(b)
			System.out.println(num+"은(는) 소수입니다");
		else
			System.out.println(num+"은(는) 소수가 아닙니다");
	}
}
