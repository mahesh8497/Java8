package NumberToWord_1_One;

import java.util.Scanner;

public class NumberToWordConverter {

		 private static final String[] tensNames = {
			        "",
			        "ten",
			        "twenty",
			        "thirty",
			        "forty",
			        "fifty",
			        "sixty",
			        "seventy",
			        "eighty",
			        "ninety"
			    };

			    private static final String[] numNames = {
			        "",
			        "one",
			        "two",
			        "three",
			        "four",
			        "five",
			        "six",
			        "seven",
			        "eight",
			        "nine",
			        "ten",
			        "eleven",
			        "twelve",
			        "thirteen",
			        "fourteen",
			        "fifteen",
			        "sixteen",
			        "seventeen",
			        "eighteen",
			        "nineteen"
			    };

			    // Converts numbers less than 1000 into words
			    private static String convertLessThanOneThousand(int number) {
			        String current;

			        if (number % 100 < 20) {
			            current = numNames[number % 100];
			            number /= 100;
			        } else {
			            current = numNames[number % 10];
			            number /= 10;
			            current = tensNames[number % 10] + (current.isEmpty() ? "" : " " + current);
			            number /= 10;
			        }
			        if (number == 0) return current;
			        return numNames[number] + " hundred" + (current.isEmpty() ? "" : " " + current);
			    }

			    // Main method to convert any number to words
			    public static String convert(int number) {
			        if (number == 0) {
			            return "zero";
			        }

			        String result = convertLessThanOneThousand(number);
			        return result.trim();
			    }

			    public static void main(String[] args) {
			        Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter a number between 1 and 1000: ");
			        int number = scanner.nextInt();

			        if (number >= 1 && number <= 1000) {
			            String numberInWords = convert(number);
			            System.out.println("The number " + number + " in words is: \"" + numberInWords + "\"");
			        } else {
			            System.out.println("Please enter a number between 1 and 999.");
			        }
			    }
			}
