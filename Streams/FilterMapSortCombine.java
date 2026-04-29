package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterMapSortCombine {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(70,60,50,30,20,10,90);
		
		list.stream()
		  .filter(n -> n>10)   //this will filter on the basis of condition
		  .map(n -> n*2)       //this will change the elements
		  .sorted()            //this will arrange it in ascending order
		  .forEach(System.out::println);

	}

}
