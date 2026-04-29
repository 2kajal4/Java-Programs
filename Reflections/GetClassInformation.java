package Reflections;

import java.lang.reflect.Field;

public class GetClassInformation {

	public static void main(String[] args) {
		
		Class<?> cls=Student.class;
		System.out.println("Class Name:"+cls.getName());
		
		Field[] fields=cls.getDeclaredFields();
		
		for(Field f:fields) {
			System.out.println("Fields:"+f.getName());
		}

	}

}
