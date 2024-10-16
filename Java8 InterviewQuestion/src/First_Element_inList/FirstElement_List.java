package First_Element_inList;

import java.util.Arrays;
import java.util.List;

public class FirstElement_List {
public static void main(String[] args) {
List<Integer>list=Arrays.asList(1,2,3,4,12,1,13);
list.stream().findFirst().ifPresent(System.out::println);
}
}
