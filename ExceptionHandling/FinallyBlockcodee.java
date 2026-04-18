package ExceptionHandling;

public class FinallyBlockcodee {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block");
		}catch(ArithmeticException e) {
			System.out.println("Catch Block!!");
		}finally {
			System.out.println("finally block!!");
		}
	}

}
