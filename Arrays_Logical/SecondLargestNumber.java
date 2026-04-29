package Arrays_Logical;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] arr= {10,60,80,90,100};
		
		int largest=arr[0];
		int secondLargest=arr[0];
//		int thirdLargest=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest) {
				largest=arr[i];
			}
	}

		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		
		//third largest element\
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=largest && arr[i]!=secondLargest && arr[i]>thirdLargest) {
//				thirdLargest=arr[i];
//			}
//		}
		
		System.out.println("Largest Element:"+largest);
		System.out.println(" second Largest Element:"+secondLargest);
//		System.out.println("third largest element:"+thirdLargest);
}
}