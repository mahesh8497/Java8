package LeftNegetive_RightpositiveNumber;

import java.util.Arrays;
import java.util.Iterator;

public class positiveNegetiveNumber {

	public static void main(String[] args) {
		 int[] arr = {1, -2, 3, -4, -6, 7, 8, -5, 9, -3};
		 rearrangeArray(arr);
//		 for (int i = 0; i < arr.length; i++) {
//			System.out.print(" "+arr[i]);
//		}
		 System.out.println(Arrays.toString(arr));
	}

	private static void rearrangeArray(int[] arr) {
		// TODO Auto-generated method stub
		int j=0,temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
	}

}


//output: [-2, -4, -6, -5, -3, 7, 8, 1, 9, 3]