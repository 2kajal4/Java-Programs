package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class BasicListMethod {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Rahul");
		l1.add("Kajal");
		l1.add("Kajal");  //Allow duplicates
		
		System.out.println("List"+l1);
	
		
		//Accessing Elements
		System.out.println("Element at index at 1:" +l1.get(1));
		
		//Update Element
		l1.set(1,"Pagal");
		
		//Remove Element
		l1.remove("Kajal");
		
		System.out.println("Upadted List:"+l1);
		
		

	}

}
