package week1;

public class FactorialLoop{ //�ݺ���
	public int calc(int n){
		int result = n;
		for(int i = n-1; i > 1; i--) {
			result = result * i;
		}
		return result;
	}
}
