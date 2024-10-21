package SortList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(43,4,2,1,3,1,324,544);
//	for (int i = 0; i < list.size(); i++)
//	{
//	for (int j = list.size()-1; j >i; j--)
//	{
//		if(list.get(i)<list.get(j)) 
//		{
//			int temp=list.get(i);
//			list.set(i, list.get(j));
//			list.set(j, temp);
//		}
//	}	
//	}
//	for(int ii:list) {
//		System.out.println(ii);
//	}
	///reverse order
	List<Integer> lii = list.stream()
			.sorted(Collections.reverseOrder())
			.collect(Collectors.toList());
	System.out.println(lii);
	
	
	
}
}
