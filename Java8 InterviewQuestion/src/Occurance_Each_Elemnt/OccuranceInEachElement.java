package Occurance_Each_Elemnt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceInEachElement {
	public static void main(String[] args) {
		String s = "qwqeqwqsadawqs";
		// java 8 insertion order preserved
		Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
		System.out.println("Count for each character in string with Sequence: " + map);
		System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

		// insertion order not preserved
		Map<String, Long> collect = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Third way with loop and collection");
		char ch;
		Map<Character, Integer> map1 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (map1.containsKey(s.charAt(i))) {
				map1.put(ch, map1.get(ch) + 1);
			} else {
				map1.put(ch, 1);
			}
		}
		System.out.println("Using Collection map: " + map1);

	}

}
