package SeconMaxElement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secondMaxEle {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,2,43,2,32,12,111);
		Optional<Integer> findFirst = list.stream()
				.distinct()//remove the duplicate
				.sorted((a,b)->b-a)//sort the list
				.skip(1).findFirst();//skip first element 
		Integer integer = findFirst.get();//get the first element
		System.out.println(integer);

	}

}
