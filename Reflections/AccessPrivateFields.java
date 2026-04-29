package Reflections;

import java.lang.reflect.Field;

public class AccessPrivateFields {

	public static void main(String[] args) throws Exception{
		
		Student s=new Student();
		Class<?> cls=s.getClass();
		
		Field f=cls.getDeclaredField("name");
		f.setAccessible(true);
		
		//set 
		f.set(s, "Kajal");
		
		System.out.println(f.get(s));

	}

}
