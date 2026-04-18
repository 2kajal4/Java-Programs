package ExceptionHandling;

import java.util.Scanner;

public class ThrowExceptions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		try {
			if(age<18) {
				throw new ArithmeticException("Not Eligible");
			}else {
				System.out.println("Eligible");
			}}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		}

	}


