package week1;

public class FactorialRecursive{ //���
	public int calc(int n) {
		if(n <= 1){
			return n;
		}
		else{
			return n * calc(n-1);
		}
	}
}