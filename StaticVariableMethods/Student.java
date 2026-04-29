package StaticVariableMethods;

public class Student {
	
	static int count=0;
	
	Student(){
		count++;
	}
	
	static void showCount() {
		System.out.println("Total Students:"+count);
	}

	public static void main(String[] args) {
		
		new Student();
		new Student();
		new Student();
		
		Student.showCount();
		
		

	}

}
