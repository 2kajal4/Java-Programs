package Streams;

import java.util.Arrays;
import java.util.List;

public class PrintElementsInStreams {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(30,40,20,10,80,90,100);
		
		list.stream().forEach(System.out::println);  //forEach loop prints the list, and it is terminal operator
		
		// :: this is known as method reference operator, this operator makes the code easy and less.
		
		//stream() converts the collections into stream for data processing.
		
		
		
		
		
		
		

	}

}
