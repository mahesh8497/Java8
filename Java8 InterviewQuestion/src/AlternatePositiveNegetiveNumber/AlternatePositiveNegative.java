package AlternatePositiveNegetiveNumber;

import java.util.*;

public class AlternatePositiveNegative {
    
    public static void rearrange(int[] arr, int n) {
        // Temporary arrays to hold positive and negative numbers
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        // Segregating positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        // Rearranging numbers alternately
        int posIndex = 0, negIndex = 0, i = 0;
        while (posIndex < positive.size() && negIndex < negative.size()) {
            if (i % 2 == 0) {
                arr[i++] = positive.get(posIndex++);
            } else {
                arr[i++] = negative.get(negIndex++);
            }
        }
        // If there are remaining positive numbers
        while (posIndex < positive.size()) {
            arr[i++] = positive.get(posIndex++);
        }
        // If there are remaining negative numbers
        while (negIndex < negative.size()) {
            arr[i++] = negative.get(negIndex++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,-5,6,7,-98,89,9,-12,11,22,33,44,55,-66};
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        rearrange(arr, n);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}
