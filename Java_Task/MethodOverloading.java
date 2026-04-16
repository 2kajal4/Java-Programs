package Java_Task;

public class MethodOverloading {

	
	
	public int add(int a,int b ) {
	   return a+b;
		
	}
	
	public double add(double a,double b ) {
		   return a+b;
			
		}
	
	public double add(int a,double b,double c) {
		return  a+b+c;
	}

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		
		System.out.println("add"+m.add(20.0, 23.3));
		System.out.println("add"+m.add(20, 20));
	    System.out.println("add"+m.add(20, 20, 20));
		

	}

}
