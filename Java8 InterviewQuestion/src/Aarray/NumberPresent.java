package Aarray;

public class NumberPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]a= {1,2,3,4,5};
		 int k=9;
		 int index=-1;
		 for (int i = 0; i < a.length; i++) {
			if(a[i]==k) {
				index=i;
				break;
			}
		}
		   if (index != -1) {
	            System.out.println("Index of " + k + ": " + index);
	        } else {
	            System.out.println("Not Available");
		// if(a[i]==k)

	        }}

}
