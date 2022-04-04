package week2;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
	public  static void threeDiv(int arr[], int num){
		int sum = num;
		Random rd = new Random();
		int ran[] = {1,2,3};
		 
		while(true) {
			if(ran[0]!=ran[1]&&ran[0]!=ran[2]&&ran[1]!=ran[2]) {
				if(ran[0]+ran[1]+ran[2] == sum)
					break;
			}
			for(int i=0; i<3; i++)
				if(sum>100)
					ran[i]=arr[rd.nextInt(100)];
				else
					ran[i]=arr[rd.nextInt(sum)];
		}
		
		System.out.println(sum+"="+ran[0]+"+"+ran[1]+"+"+ran[2]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int num;
		
		for(int i=0; i<100; i++) {
			arr[i] = i+1;
		}
		System.out.print("숫자를 입력하세요 : ");
		num=sc.nextInt();
		
		if(num<6 || num>297) {
			System.out.println("표현 할 수 없습니다.");
		}else {
			threeDiv(arr, num);
		}
	}
}
