package Streams;

import java.util.Arrays;
import java.util.List;

public class SortMethod {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(30,20,50,60,10,90);
		
		list.stream()
		   .sorted()   //sorted() method will return the list in ascending or descending order...
		   .forEach(System.out::println);
	}

}
