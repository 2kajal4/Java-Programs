package Arrays_Logical;

public class SmallestNumber {

	public static void main(String[] args) {
      int[] arr= {10,60,30,80};
		
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("The largest number of the array is :"+smallest);


	}

}
