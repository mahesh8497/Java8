package two_list_print_common_string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class launch {

	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("apple", "banana", "orange", "mango", "grapes");
		
	        List<String> list2 = Arrays.asList("banana", "kiwi", "grapes", "apple", "watermelon");

	        // Finding common elements
	       // List<Integer> commonElements = list1.stream()
	        		List<String> commonElements = list1.stream()
	                .filter(list2::contains)
	                .distinct()
	                .collect(Collectors.toList());

	        // Printing the common elements
	        commonElements.forEach(System.out::println);
	        
	        
	        
	        
	        
	//  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>      
	        
	   //same number print for integer list  
	        
   //  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	        
	        //List<Integer> list1 = Arrays.asList(1, 2,3,4,5);
			 //List<Integer> list2 = Arrays.asList(1,2,3,4);
//	        List<Integer> commonElements = list1.stream()
//	                .filter(list2::contains)
//	                .distinct()
//	                .collect(Collectors.toList());
//
//	        // Printing the common elements
//	        commonElements.forEach(System.out::println);
	        
	      

	}

}
