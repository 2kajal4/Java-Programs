package Reflections;

import java.lang.reflect.Method;

public class MethodWithParameters {

	public static void main(String[] args) throws Exception {
		
		Calculator c=new Calculator();
		Class<?> cls=c.getClass();
		
		Method m=cls.getDeclaredMethod("add",int.class,int.class);
		
		int result=(int) m.invoke(c,10,20);
		
		System.out.println("Result:"+result);
		

	}

}
