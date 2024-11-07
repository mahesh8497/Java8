package count_NumberOfObject;

public class Demo {
	 static int count=0;
	 {
		 count++;
	 }
	 public static void main(String[] args) {
		Demo d= new Demo();
		Demo d1=new Demo();
		System.out.println(count);
	}

}
