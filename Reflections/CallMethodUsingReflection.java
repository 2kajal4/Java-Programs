package Reflections;

import java.lang.reflect.Method;

public class CallMethodUsingReflection {

	public static void main(String[] args)throws Exception {
	
		Student s=new Student();
		Class<?> cls=s.getClass();
		
		Method m=cls.getDeclaredMethod("show");
		m.invoke(s);
	}

}
