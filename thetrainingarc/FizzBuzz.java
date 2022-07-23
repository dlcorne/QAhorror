package thetrainingarc;

import java.util.Scanner;

public class FizzBuzz {
	
	private static int i1;
	
	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = in1.nextInt();
		String FB = fizzbussin(i1);
		System.out.println(FB);
		in1.close();
		
	}
	
	public static String fizzbussin(int i1) {
		if (i1 % 15 == 0) {
			return "FizzBuzz";
		} if (i1 % 5 == 0) {
			return "Buzz";
		} if (i1 % 3 == 0) {
			return "Fizz";
		}
		return "There is no way for the program to reach this, yet it requires it to run";
		
	}
}