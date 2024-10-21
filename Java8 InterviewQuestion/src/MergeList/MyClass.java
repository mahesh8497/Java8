package MergeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> l2 = Arrays.asList(2, 32, 1,3);
		List<Integer> l3 = Arrays.asList(12, 132, 11,31);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		System.out.println("list: "+list);
		List<Integer> collect = Stream.of(l1,l2,l3)
				.flatMap(n->n.stream())
				.collect(Collectors.toList());
		System.out.println("Combined List: "+collect);
		
		
		
		
		
		
		
		
		
		// second Way
		List<Integer> co = Stream.of(l1, l2,l3).
				flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println("merge list: "+co);//merge list
		
		
		Set<Integer>coo=co.stream().collect(Collectors.toSet());
		System.out.println("after removing duplicate : "+coo);//after removing duplicate on list	

		
		HashSet<Integer>hs=new HashSet<>(co);
		System.out.println("fun logic removed duplicate: "+hs);
	}
}
