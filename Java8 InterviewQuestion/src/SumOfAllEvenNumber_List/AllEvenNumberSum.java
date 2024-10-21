package SumOfAllEvenNumber_List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllEvenNumberSum {
	public static void main(String[] args) {
		List<Integer>al=Arrays.asList(1,2,3,4,56,7,8);
		
		int allSumNum = al.stream().mapToInt(i->i).sum();
		System.err.println("Sum Of All number: "+allSumNum);
		
		int sum=al.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all even number using java 8"+sum);
		
		 int sum1 = 0;
	        for (int num : al) {
	            if (num % 2 == 0) {
	                sum1 += num;
	            }
	        }
	        System.out.println("Sum of all even Number: "+sum1);
	        
	        List<Integer> sortedList = al.stream()
	        		.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        System.out.println("SortedList: "+sortedList);
	        
	        
	        Integer s3=al.stream().sorted(Comparator.reverseOrder())
	        .mapToInt(Integer::intValue).skip(1).findFirst().orElse(0);
	        System.out.println("second Highest Number: "+s3);
    }
}