package Arrays_Logical;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,60,30,80};
		
		int largest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("The largest number of the array is :"+largest);

	}

}
