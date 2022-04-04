package week3;

public class TimeComplexity {
	static int fConstant(int[] arr) {	//O(1)
		return arr.length;
	}
	
	static int fLinear(int[] arr) {		//O(N)
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += i;
		return sum;
	}
	
	static int[][] fQuadratic(int[] arr) {	//O(N^2)]
		int[][] twoDimen = new int[arr.length][arr.length];
		for(int i = 0; i < twoDimen.length; i++) 
			for(int j = 0; j < twoDimen.length; j++) 
				twoDimen[i][j] = i*arr.length+1+j;
				
		return twoDimen;
	}
	
	static int fCubic(int[] arr) {	//O(N^3)
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length;j++)
				for(int k = 0; k < arr.length; k++)
					sum +=k+j+i;
		return sum;
	}
	
	static int fFourth(int[] arr) { //O^4
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length; j++)
				for(int k = 0; k < arr.length; k++)
					for(int l = 0; l < arr.length; l++)
						sum += i*j*k*l;
		return sum;
	}
	
	public static void main(String[] args) {
		//O(1)
		int[] arr = new int[10];							// create an array
		for(int i = 0 ; i < arr.length ; i++ ) arr[i] = 0; 	// initialize
		long beforeTime = System.currentTimeMillis();		// start the timer
		fConstant(arr); 									// wait until it returns
		long afterTime = System.currentTimeMillis(); 		// finish the timer
		long diffTimeMilliSecond = afterTime-beforeTime; 	// get the diff
		System.out.println("Time diff (ms): " + diffTimeMilliSecond);
		
		//O(N)
		beforeTime = System.currentTimeMillis();		
		fLinear(arr); 
		afterTime = System.currentTimeMillis(); 
		diffTimeMilliSecond = afterTime-beforeTime;
		System.out.println("Time diff (ms): " + diffTimeMilliSecond);
		
		//O(N^2)
		beforeTime = System.currentTimeMillis();		
		fQuadratic(arr); 
		afterTime = System.currentTimeMillis(); 
		diffTimeMilliSecond = afterTime-beforeTime;
		System.out.println("Time diff (ms): " + diffTimeMilliSecond);
		
		//O(N^3)
		beforeTime = System.currentTimeMillis();		
		fCubic(arr); 
		afterTime = System.currentTimeMillis(); 
		diffTimeMilliSecond = afterTime-beforeTime;
		System.out.println("Time diff (ms): " + diffTimeMilliSecond);
		System.out.println(fCubic(arr));
		//O(N^4)
		//beforeTime = System.currentTimeMillis();		
		//fFourth(arr); 
		//afterTime = System.currentTimeMillis(); 
		//diffTimeMilliSecond = afterTime-beforeTime;
		//System.out.println("Time diff (ms): " + diffTimeMilliSecond);
	}
}