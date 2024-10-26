package A_SortingTechniq;

public class BubbleSort {
	 public static void main(String[] args) {
	        int[] arr = {5, 1, 4, 2, 8};
	        
	        System.out.println("Before Sorting:");
	        printArray(arr);
	        
	        bubbleSort(arr);
	        
	        System.out.println("After Sorting:");
	        printArray(arr);
	    }
	    
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        
	        // Traverse through all elements in the array
	        for (int i = 0; i < n - 1; i++) {
	            // Last i elements are already sorted, so ignore them
	            for (int j = 0; j < n - i - 1; j++) {
	                // Swap if the element is greater than the next element
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	    
	    // Utility method to print an array
	    public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	
}
