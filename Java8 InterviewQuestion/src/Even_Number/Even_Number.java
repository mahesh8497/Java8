package Even_Number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_Number {
	public static void main(String[] args) {
		List<Integer>aa= Arrays.asList(1,2,3,4,5,6);
		List<Integer> collect = aa.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
