package Duplicate_Char;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyClass {
public static void main(String[] args) {
	String str= "acaaaacddeeffgghhc";
	
	Map<Character, Long>charMap=str.chars()
			.mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	charMap.entrySet().stream().filter(e->e.getValue()>1)
	.forEach(entry->System.out.print(entry.getKey()));
	
	//System.out.println("Element Repetation: "+charMap);
	
	System.out.println();
	
	for (int i = 0; i < str.length(); i++)
	{
		char ch= str.charAt(i);
		int rank=0;
		for (int j = i+1; j <str.length(); j++) 
		{
		if(ch==str.charAt(j))
			rank++;
		}
		if(rank==0)
			System.out.print(ch+" ");
		
	}
}
}
