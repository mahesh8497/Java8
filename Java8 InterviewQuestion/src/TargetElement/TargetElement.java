package TargetElement;

public class TargetElement {

	public static void main(String[] args) {
		int[]a= {1,5,5,9,2,0,-4,-2,5,-1,3,3,3};
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
		for (int j = i+1; j < a.length; j++) 
		{
//		for (int k = j+1; k < a.length; k++)
//		{
		int sum=0;
		sum=a[i]+a[j];
		if(sum==2)
			System.out.println(a[i]+" "+a[j]+"="+sum);
	//	}	
		}	
		}
	}}
