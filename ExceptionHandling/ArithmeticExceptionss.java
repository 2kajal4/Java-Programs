package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter first number:");
			int a=sc.nextInt();
			
			System.out.println("enter second number:");
			int b=sc.nextInt();
			
			int result= a/b;
			
			System.out.println("Result" +result);
			
		}catch(ArithmeticException e){
			System.out.println("Error : number cannot be divided by zero");
			
		}catch (Exception e) {
            
            System.out.println("Error: Invalid input!");
        } finally {
            System.out.println("Program ended safely.");
            sc.close();
        }
		
	}

}
