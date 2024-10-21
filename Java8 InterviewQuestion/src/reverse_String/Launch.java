package reverse_String;

public class Launch {
public static void main(String[] args) {
	String s="qwer takale";
	String rev="";
	char ch;
	for (int i = 0; i < s.length(); i++)
	{
		ch=s.charAt(i);
		rev=ch+rev;
	}
	System.out.println(rev);
	
	System.out.println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("Reversed String(second way): " + reverseString(s));
}

private static String reverseString(String s) {
    char[] charArray = s.toCharArray();
    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {
        // Swap the characters
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        left++;
        right--;
    }
    return new String(charArray);
}
}
