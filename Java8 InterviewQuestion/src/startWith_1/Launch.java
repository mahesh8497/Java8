package startWith_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Launch {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,3,4,11,23,12,14);
	List<Integer>ll=list.stream().filter(e->e.toString().startsWith("1")).collect(Collectors.toList());
	System.out.println(ll);
}
}
