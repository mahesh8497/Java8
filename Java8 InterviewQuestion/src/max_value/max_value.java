package max_value;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class max_value {
	public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,4,5,6);
	
	int mn=list.stream().max(Integer::compare).get();
	System.out.println("Max value: "+mn);
	
	//using lambda expression
	Optional<Integer> max1 = list.stream().max((a,b)->a.compareTo(b));
	max1.ifPresent(max->System.out.println("maximum value: "+max));
	
	
	Integer min = list.stream().min(Integer::compare).get();
	System.out.println("Min value: "+min);
	}
	

}
