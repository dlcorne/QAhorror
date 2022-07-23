package thetrainingarc;

import java.util.Scanner;
		
public class Calculator {
	
	public static void main(String[] args) {
		int i1, i2, addResult;
		Scanner input1 = new Scanner(System.in); // could not figure how to close the non-final scanners without breaking the program :(((
		System.out.println("Enter first integer:");
		i1 = input1.nextInt();
		System.out.println("Enter second integer:");
		i2 = input1.nextInt();
		addResult = i1 + i2;
		System.out.println("Addition Result: " + addResult);
		subtraction();
	}
		
	public static void subtraction() {
		int i1, i2, subResult;
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = input1.nextInt();
		System.out.println("Enter second integer:");
		i2 = input1.nextInt();
		subResult = i1 - i2;
		System.out.println("Subtraction Result: " + subResult);
		multiplication();
	}
		
	public static void multiplication() {
		int i1, i2, mulResult;
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = input1.nextInt();
		System.out.println("Enter second integer:");
		i2 = input1.nextInt();
		mulResult = i1 * i2;
		System.out.println("Multiply Result: " + mulResult);
		division();	
	}
		
	public static void division() {
		double i1, i2, divResult;
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = input1.nextDouble();
		System.out.println("Enter second integer:");
		i2 = input1.nextDouble();
		if (i1 < i2) {
		System.out.println("Second number cannot be larger than first.");
		division();
		} else { 
		divResult = i1 / i2;
		System.out.println("Division Result: " + divResult);
		input1.close();
	}
	}
	
}