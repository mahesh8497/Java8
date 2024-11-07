package SubString;

import java.util.HashSet;

public class Substring_Java8 {

	public static void main(String[] args) {
		String s = "abcadaaab";
		int maxLength = 0, startIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			HashSet<Character> ss = new HashSet<>();
			int j = i;
			while (j < s.length() && !ss.contains(s.charAt(j))) {
				ss.add(s.charAt(j));
				j++;
			}
			// Update maxLength and startIndex if
			// we found a longer substring
			if (j - i > maxLength) {
				maxLength = j - i;
				startIndex = i;	}
		}
		// Output the results
		// System.out.println(maxLength);
		// System.out.println("at starting index of the substring " + startIndex);
		System.out.print("Substring: ");
		System.out.println(s.substring(startIndex, startIndex + maxLength));
	}
}
