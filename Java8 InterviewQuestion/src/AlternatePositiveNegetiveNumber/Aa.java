package AlternatePositiveNegetiveNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class Aa {
	public static void main(String[] args) {
		int[] arr = { -1, 2, 3, 4, -5,  9, -12 };
		int n = arr.length;

		System.out.println("Original Array: " + Arrays.toString(arr));

		rearrange(arr, n);

		System.out.println("Rearranged Array: " + Arrays.toString(arr));
	}

	private static void rearrange(int[] arr, int n) {
		ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negetive = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) {
				positive.add(arr[i]);
			} else {
				negetive.add(arr[i]);
			}
		}

		int pIndex = 0, nIndex = 0, i = 0;
		while (pIndex < positive.size() && nIndex < negetive.size()) {
			if (i % 2 == 0)
			{
				arr[i++] = positive.get(pIndex++);
			} else 
			{
				arr[i++] = negetive.get(nIndex++);
			}
		}
		while (pIndex < positive.size()) {
			arr[i++] = positive.get(pIndex++);
		}
		while (nIndex < negetive.size()) {
			arr[i++] = negetive.get(nIndex++);
		}
	}
}
