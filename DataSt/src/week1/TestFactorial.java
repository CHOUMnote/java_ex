package week1;
import java.util.Scanner;

public class TestFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FactorialRecursive fr = new FactorialRecursive();
		FactorialLoop tl = new FactorialLoop();
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.println(fr.calc(num));
		System.out.println(tl.calc(num));
	}
}