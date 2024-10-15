package RemoveDuplicateElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ByJava8_DupliEle {

	public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1, 3, 2, 4, 3, 1, 2);
 
	System.out.println("first way");
	Set<Integer> setNoDups = list.stream().collect(Collectors.toSet()); 
	// Converted the List into Stream and collected it to “Set” 
	// Set won't allow any duplicates 
	setNoDups.forEach((i) -> System.out.print(" " + i)); 
	
	
	
	
	System.out.println("\n second way");
	Set<Integer>set=new HashSet<>();
	 list.stream().filter(e->set.add(e)).forEach(System.out::println);
	
	System.out.println("third way");
	List<Integer> inputArrayList = Arrays.asList(1, 3, 2, 4, 3, 1, 2);
	List<Integer> collect = inputArrayList.stream().distinct()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		System.out.println(collect);
	
	

	}

}
