package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(40,50,20,10,5,70,80);
		
		list.stream()
		    .filter(n -> n>10)
		    .forEach(System.out::println);
		
         //filter() method Keep only that elements that match condition
	}

}
