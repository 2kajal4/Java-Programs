package Streams;

import java.util.Arrays;
import java.util.List;

public class MapMethod {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(80,40,30,60,20);
		
		list.stream()
		  .map(n -> n*2)   //map() method change the each element to something else..
		  .forEach(System.out::println);
		

	}

}
