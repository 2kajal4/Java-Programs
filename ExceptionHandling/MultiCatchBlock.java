package ExceptionHandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		
		int [] arr= {10,20,30};
		
		try {
			int a=10/0;
			
			System.out.println(arr[5]);
			
		}catch(ArithmeticException e) {
			System.out.println("Number cannot be divided by zero!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index!!");
		}
		
		System.out.println("program ended!!");

	}

}
