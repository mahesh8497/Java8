
package CountForEachCharacter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Launch {
	public static void main(String[] args) {
		String s="javajavaee";
		//Insertion order preserved
		Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase)
	            .collect(Collectors
	            .groupingBy(e -> e, 
	              LinkedHashMap::new, Collectors.counting()));
		System.out.println("Count for each character in string: "+map);
		
		System.out.println();
		//output:  {j=2, a=4, v=2, e=2}
	
		
		// insertion order not preserved
	Map<String, Long> output=	Arrays.stream(s.split("")).collect(Collectors
				.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(" Insertion not preserved: "+ output);
		//output: {a=4, e=2, v=2, j=2}
		
		
		
		
		System.out.println();
		
		System.out.println("Third way with loop and collection");

		char ch;
		Map<Character, Integer> map1=new HashMap<>();
		
		for (int i = 0; i <s.length(); i++) {
			ch=s.charAt(i);
			if(map1.containsKey(s.charAt(i))) {
			map1.put(ch, map1.get(ch)+1);
			}
			else {
				map1.put(ch, 1);
			}
		}
System.out.println("Using Collection map: "+map1);

//output: {a=4, e=2, v=2, j=2}


	}

}

