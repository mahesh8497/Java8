package Array_MissingNumber;

import java.util.Arrays;

public class MissingNumber {
	 public static int findMissingNumber(int[] arr) {
	        int n = arr.length + 1;
	        int expectedSum = n * (n + 1) / 2; // Sum of first n+1 natural numbers
	        int actualSum = 0;
	        
	        for (int num : arr) {
	            actualSum += num;
	        }
	        
	        return expectedSum - actualSum;
	    }
	    public static void main(String[] args) {
	        int[] arr = {1,2,3,5};
	        System.out.println("Missing Number: " + findMissingNumber(arr));
	    }
	}