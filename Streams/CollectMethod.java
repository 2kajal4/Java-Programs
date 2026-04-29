package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(70,60,50,30,20,10,90);
		
		List<Integer> result=list.stream()
				.filter(n -> n>10)
				.collect(Collectors.toList());  //collect() method will convert stream to collection...
		
		
		System.out.println(result);
		

	}

}
