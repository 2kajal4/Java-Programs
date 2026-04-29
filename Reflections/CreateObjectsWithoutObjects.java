package Reflections;

import java.lang.reflect.Constructor;

public class CreateObjectsWithoutObjects {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Student.class;

        Constructor<?> cons = cls.getConstructor();

        Object obj = cons.newInstance();

	}

}
