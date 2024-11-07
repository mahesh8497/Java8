package Occurance_Each_Elemnt;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurancewith_StringArrays {
public static void main(String[] args) {
	String []s= {"a","b"};
	Map<String, Long> map = Arrays.stream(s).map(String::toLowerCase)
			.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
	System.out.println("Count for each character in string with Sequence: " + map);
}
}
