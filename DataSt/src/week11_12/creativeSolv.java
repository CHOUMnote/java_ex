package week11_12;

public class creativeSolv {
	/*	투포인터 활용 ※배열 정렬 필요!
	public Boolean findTwoNum (int arr[], int sum) {
		int low = 0;
		int high = arr.length-1;
		while(low < high) {
			int temp_sum = arr[low] + arr[high];
			if(temp_sum == sum) return true;
			else if(temp_sum > sum) high--;
			else low++;
		}
		return false;
	}
	*/
	public Boolean findTwoNum (int arr[], int sum) {
		Chaining<Integer,Integer> ch = new Chaining<>();
		for(int i = 0; i<arr.length; i++) {
			int diff = sum - arr[i];
			if(ch.get(diff) != null && ch.get(diff)+arr[i] == sum) return true;
			else ch.put(arr[i], arr[i]);
		}
		return false;
	}
}
