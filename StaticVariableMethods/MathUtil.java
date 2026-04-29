package StaticVariableMethods;

public class MathUtil {
	
	static int  add(int a,int b){
		return a+b;
	}

	static int  multiply(int a,int b){
		return a*b;
	}
	public static void main(String[] args) {
		
		System.out.println(MathUtil.add(10,10));
		System.out.println(MathUtil.multiply(10,10));
		
		
		

	}

}
