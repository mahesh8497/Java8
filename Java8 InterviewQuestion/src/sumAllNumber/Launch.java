package sumAllNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Launch {
public static void main(String[] args) {
//	List<Integer>list=new ArrayList<>();
//	list.add(1);
//	list.add(2);
//	list.add(3);
//	list.add(4);
//	int sum=0;
//	for(int i=0;i<list.size();i++) {
//		sum+=list.get(i);
//	}
//	System.out.println("Sum-> "+sum);

	List<Integer>list1=Arrays.asList(1,2,3,4);
	Optional<Integer> sum1 = list1.stream().reduce((a,b)->a+b);
	System.out.println(sum1.get());
	
	
	
	
	//By Using Java8
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub\
//		ArrayList<Integer>list=new ArrayList<>();
//		list.add(12);
//		list.add(13);
//		list.add(14);
//		list.add(15);
//		list.add(16);
//		System.out.println(sum(list));
//	}
//	private static int sum(ArrayList<Integer> list) {		
//		return list.stream().mapToInt(i->i).sum();
//	}
	
	
	int[]ar= {1,2,3,1};
	HashMap<Integer, Integer>hm=new HashMap<>();
	int sum=0;
	for(int i=0;i<ar.length;i++) {
		if(hm.containsKey(ar[i]))
				{hm.put(ar[i], hm.get(ar[i])+1);}
		else {
			hm.put(ar[i], 1);
		}
		
	}for(int key: hm.keySet()) {
		if(hm.get(key)==1) {
			sum=sum+key;
			
		}
	}
	System.out.println("Summation of only distinict number: "+sum);
	
}
}
