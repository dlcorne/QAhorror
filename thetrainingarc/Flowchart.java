package thetrainingarc;

import java.util.Scanner;

public class Flowchart{
	
	public static int i1 = 0;
	public static int i2 = 0;
	public static boolean isMath = (i1 == i2);
	
	/*
	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = in1.nextInt();
		System.out.println("Enter second integer:");
		i2 = in1.nextInt();
		in1.close();
		firstTime(i1, i2, isMath);
	}
	
	*/
	
	public static void main(String[] args) {
		Scanner Ai = new Scanner(System.in);
		System.out.println("Enter A:");
		int A = Ai.nextInt();
		if (A > 2000) {
			System.out.println("Out A");
			if (A > 6000) {
				System.out.println("Out C");
			} else { 
				System.out.println("Out B");
				if (A > 4000) {
					System.out.println("Out D");
				} else {
					System.out.println("Out E");
					
				}
				
			}
		} else {
			System.out.println("Out 1");
			if (A > 100) { 
				System.out.println("Out 3");
				if (A > 600) {
					System.out.println("Out 5");
				} else {
					System.out.println("Out 4");
					if (A > 500) {
						System.out.println("Out 6");
					} else {
						System.out.println("Out 7");
						
					}
				}
			} else {
				System.out.println("Out 2");
		}
		Ai.close();}
		
	}
	
	public static void firstTime(int i1, int i2, boolean isMath) {
		
		if (isMath) {
			int result = i1 + i2;
			System.out.println("True boolean. Output " + result);
		} else {
			int result = i1 * i2;
			System.out.println("False boolean. Output " + result);
		}
	}
}