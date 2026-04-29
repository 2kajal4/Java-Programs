package StaticVariableMethods;

public class Employee {
	
	static int counter=1;
	int id;
	String name;
	
	Employee(String name){
		this.name=name;
		id=counter++;
	}
	
	public void display() {
		System.out.println("id:"+id+"........"+name);
	}

	public static void main(String[] args) {
		Employee e1=new Employee("Kajal");
		Employee e2=new Employee("Pooja");
		
		e1.display();
		e2.display();

	}

}
