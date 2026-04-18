package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
	  
		List<Integer> list=new ArrayList<>();
		list.add(30);
		list.add(40);
		list.add(80);
		list.add(20);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		

	}

}
