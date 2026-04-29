package Serialization;

import java.io.*;

public class Student implements Serializable{
	
	int id;
	String name;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialization
		
//		Student s= new Student(1,"Kajal");
//		
//		FileOutputStream fos=new FileOutputStream("student.txt");
//		ObjectOutputStream oo=new ObjectOutputStream(fos);
//		
//		oo.writeObject(s);
//		
//		fos.close();
//		oo.close();
//		
//		System.out.println("Object Serialized");
		
		
	                 //Deserialization
		
		FileInputStream foi =new FileInputStream("student.txt");
		 ObjectInputStream ois = new ObjectInputStream(foi);
		 
		 Student s =(Student) ois.readObject();
		 
		 foi.close();
		 ois. close();
		 
		 System.out.println(s.id+ "  "+s.name);
		 
		 
		
		
		

	}

}
