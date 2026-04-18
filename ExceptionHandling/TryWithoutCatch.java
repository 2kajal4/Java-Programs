package ExceptionHandling;

public class TryWithoutCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("try block!!");
			int a=10/0;
		}finally {
			System.out.println("Finally Block!!");
		}

	}

}
