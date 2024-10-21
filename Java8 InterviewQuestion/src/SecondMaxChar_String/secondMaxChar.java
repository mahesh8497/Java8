package SecondMaxChar_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class secondMaxChar {

	public static void main(String[] args) {
		String s="asdasasfsdecaa";
		char[]a1=s.toCharArray();
		int dupliCount=0;
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = i+1; j < a1.length; j++) 
			{
				if(a1[i]==a1[j])
				{
					dupliCount++;
				break;
				}
			}
		}
		System.out.println("DuplicateCount: "+dupliCount);
		char[]a2=new char[a1.length-dupliCount];
		int[]a3=new int[a2.length];
		int index=0;
		for (int i = 0; i < a1.length; i++)
		{
			int count=0;
			for (int j = 0; j < a2.length; j++)
			{
			if(a1[i]==a2[j])
				count++;
			}
			if(count==0)
				a2[index++]=a1[i];
		}
		for (int i = 0; i < a2.length; i++)
		{
		int count=0;
		for (int j = 0; j < a1.length; j++) 
		{
		if(a1[j]==a2[i])
			count++;
		}
		a3[i]=count;
		}
		for (int i = 0; i < a3.length; i++) 
		{
		for (int j = 0; j < a3.length; j++) 
		{
			if(i<j && a3[i]>a3[j])
			{
				int temp=a3[i];
				a3[i]=a3[j];
				a3[j]=temp;
				char  temp1=a2[i];
				a2[i]=a2[j];
				a2[j]=temp1;
			}
		}	
		}
		for (int i = 0; i < a3.length; i++) 
		{
		System.out.println(a2[i]+" "+a3[i]);	
		}
		System.out.print("second max "+a2[a2.length-2]+" element "+a3[a3.length-2]+" times");
		
//		System.out.println(">>>>>>>>>>>>>>>>>>second Way<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//		System.out.println("Using Collection");
//		Map<Character, Integer>map=new HashMap<>();
//		for (int i = 0; i < s.length(); i++)
//		{
//		if(map.containsKey(s.charAt(i)))
//			map.put(s.charAt(i), map.get(s.charAt(i))+1);
//		else
//			map.put(s.charAt(i), 1);
//		}
//	Set<Character>set=map.keySet();
//	Object[]array=set.toArray();
//	for (int i = 0; i < array.length; i++) {
//		for (int j =i+1; j < array.length; j++)
//		{
//			if(map.get(array[i])>map.get(array[j]))
//			{
//				Object temp=array[i];
//				array[i]=array[j];
//				array[j]=temp;
//			}
//		}
//	}
//	for (int i = 0; i < array.length; i++) {
//		System.out.println(array[i]+" "+map.get(array[i]));
//		
//	}
//	System.out.println("Largest Element");
//	System.out.println(array[array.length-2]+" "+map.get(array[array.length-2]));
//	
	}



		
	

}
