package week1;

public class FactorialLoop{ //¹İº¹¹®
	public int calc(int n){
		int result = n;
		for(int i = n-1; i > 1; i--) {
			result = result * i;
		}
		return result;
	}
}
