package Duplicate_Char;

public class for_Logic {
	public static void main(String[] args) {
		String s="aaac";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			int rank=0;
			for (int j = i+1; j < s.length(); j++)
			{
				if(s.charAt(j)==ch) {
					rank++;
				}
			}
			if(rank==0) {
				System.out.print(ch+" ");
			}
		}
	}

}
