package RemoveDuplicateElement;

import java.util.Iterator;

public class ByLogic_DuplicateRemove {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 1, 2, 3 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j]);

					c++;
					break;
				}

			}

		}
		System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(c + "couuuuut");
		System.out.println("After removing duplicate");
		int[] b = new int[a.length - c];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int rank = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					rank++;
			}
			if (rank == 1) {
				b[index++] = a[i];
			}
		}
		System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<");

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

}
