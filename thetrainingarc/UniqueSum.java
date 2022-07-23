package thetrainingarc;

import java.util.Scanner;

public class UniqueSum {
	
	public static int i1;
	public static int i2;
	public static int i3;
	
	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = in1.nextInt();
		System.out.println("Enter second integer:");
		i2 = in1.nextInt();
		System.out.println("Enter third integer:");
		i3 = in1.nextInt();
		in1.close();
		theTest(i1, i2, i3);
	}	
		
	public static int theTest(int i1, int i2, int i3) {	
		
		if (i1 == i2) {
			i1 = 0;
			i2 = 0;
		} if (i1 == i3) {
			i1 = 0;
			i3 = 0;
		} if (i2 == i3) {
			i2 = 0;
			i3 = 0;
		}
		int result = i1 + i2 + i3;
		System.out.println(result);
		System.out.println("I1: " + i1 + " I2: " + i2 + " I3: " + i3);
		return result; 
	}
}