package StaticVariableMethods;

public class StaticMethodCallingStaticVariable {
	
	static double PI = 3.14;
	
	static double area(double r) {
        return PI * r * r;
    }
	
	public static void main(String[] args) {
		 System.out.println("Area: " + StaticMethodCallingStaticVariable.area(5));
		
	}
	

}
