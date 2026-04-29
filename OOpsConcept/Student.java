package OOpsConcept;

public class Student {

	private int id;
	private String name;
	private double marks;
	
	public Student(int id,String name,double marks) {
		this.id=id;
		this.name=name;
		
		if(marks>=0 && marks<=100) {
			this.marks=marks;
		}else {
			this.marks=0;
		}
		
	}
	
	public String calculateGrade() {
		if(marks>=90) return "A+";
		else if(marks>=70) return "B";
		else if(marks>=60) return "C";
		else if(marks>=50) return "D";
		else return "Fail";
	}
	
	public void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Marks"+marks);
		System.out.println("calculateGrade:"+calculateGrade());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"kajal",90.0);
		Student s2 =new Student(2,"Sohail",50.5);
		
		s1.display();
		System.out.println();
		s2.display();

	}

}
