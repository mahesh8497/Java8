package Aarray;

public class swap2Number_without3rdvariable {
public static void main(String[] args) {
	int a=5;
	int b=10;
	  // Swapping using addition and subtraction
    a = a + b;  // a now becomes 15
    b = a - b;  // b now becomes 5
    a = a - b;  // a now becomes 10

    System.out.println("After swap: a = " + a + ", b = " + b);
}
}
