package AlternatePositiveNegetiveNumber;

import java.util.ArrayList;
import java.util.Scanner;

class Launch {
	public static int[] RearrangebySign(int[] A, int n) {

		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			if (A[i] > 0)
				pos.add(A[i]);
			else
				neg.add(A[i]);
		}

		for (int i = 0; i < n / 2; i++) {

			A[2 * i] = pos.get(i);
			A[2 * i + 1] = neg.get(i);
		}

		return A;
	}

	public static void main(String args[]) {
		// Array Initialisation.
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		//int A[] = { 1, 2, -4, -5 };
        int[] A = new int[n];

		 for (int i = 0; i < n; i++) {
	            if (sc.hasNextInt()) {
	                A[i] = sc.nextInt();
	            }
	        }
		int[] ans = RearrangebySign(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}