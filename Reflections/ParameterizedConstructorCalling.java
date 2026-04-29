package Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ParameterizedConstructorCalling {

	public static void main(String[] args)throws Exception {
		

        Class<?> cls = Student.class;

        Constructor<?> cons = cls.getConstructor(String.class,int.class);

        Object obj = cons.newInstance("Kajal",101);

        Method m = cls.getDeclaredMethod("show");
        m.invoke(obj);

	}

}
