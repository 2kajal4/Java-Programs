package Reflections;

public class Student {

	int id;
	private String name="Default";
	
	public Student() {
		System.out.println("constructor called!");
	}
	
	public Student(String name,int id) {
        this.name = name;
        this.id=id;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void show() {
		System.out.println("Hello from the method!");
	}
	
	
	
}
