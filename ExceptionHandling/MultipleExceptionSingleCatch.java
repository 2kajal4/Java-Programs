package ExceptionHandling;

public class MultipleExceptionSingleCatch {

	public static void main(String[] args) {
		try {
			String str=null;
			
			int a=10/0;
			
			System.out.println(str.length());
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("Exception occurred:" +e);
		}

	}

}
