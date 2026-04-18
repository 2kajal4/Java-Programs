package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversingList {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		//for loop
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Enhanced for loop
		for(int num:list) {
			System.out.println(num);
		}
		
		//Iterator
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
	}

}
