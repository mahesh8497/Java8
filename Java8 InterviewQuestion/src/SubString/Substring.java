package SubString;

public class Substring {
	public static void main(String[] args) {
		String s="abcab";
		int len=0, index=0;
		for (int i = 0; i <s.length(); i++) 
		{
			int j = i+1;
			for (; j < s.length(); j++) 
			{
				boolean presentele=false;
				for (int k =i; k <j; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
					{
						presentele=true;
						break;
					}
				}
				if (presentele)
					break;
			}
				if(j-i>len)
				{
					index=i;
					len=j-i;
				}
		}
		System.out.println(len);
		System.out.println("at starting index of the substring "+index);
		for (int i = index; i <index+len; i++) {
			System.out.print(s.charAt(i));
	}}}
