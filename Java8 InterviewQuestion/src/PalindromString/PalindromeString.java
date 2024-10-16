package PalindromString;

public class PalindromeString {

	public static void main(String[] args) {
		String str="asdsqa";
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
	private static boolean isPalindrome(String str) {
		String reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			reverse +=str.charAt(i);
		}
		if(str.equals(reverse)) {
			return true;
		}
		else
		return false;
	}
}
