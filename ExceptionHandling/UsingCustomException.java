package ExceptionHandling;

public class UsingCustomException {
	
	static void checkAge(int age) throws CustomInvalidAgeException{
		if(age<18) {
			throw new CustomInvalidAgeException();
		}else {
			System.out.println("Eligible");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(13);
		}catch(CustomInvalidAgeException e) {
			System.out.println("Age is less than 18");
		}

	}

}
