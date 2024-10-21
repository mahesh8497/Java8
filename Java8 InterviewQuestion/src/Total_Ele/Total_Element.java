package Total_Ele;

import java.util.Arrays;
import java.util.List;


//Given a list of integers, find the total 
//number of elements present in the list using Stream functions?


public class Total_Element {
public static void main(String[] args) {
	List<Integer>list= Arrays.asList(1,2,3,4,3,12,1);
	System.out.println(list.stream().count());
}
}
