package thetrainingarc;

import java.util.Scanner;

public class Taxes {
	
	public static int i1;
	public static int taxRate;
	
	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = in1.nextInt();
		if (i1 < 15000) {
			taxRate = 0;
		} if (i1 >= 15000 && i1 < 20000) {
			taxRate = 10;
		} if (i1 >= 20000 && i1 < 30000) {
			taxRate = 15;
		} if (i1 >= 30000 && i1 < 45000) {
			taxRate = 20;
		} if (i1 >= 45000) {
			taxRate = 25;
		}
		in1.close();
		getTaxed();
	}
	public static int getTaxed() {
		System.out.println("Debug: taxRate = " + taxRate);
		int tax = ((i1 * taxRate) / 100);
		System.out.println("You will be taxed " + ((i1 * taxRate) / 100) + ". Taxation is theft.");
		return tax;
	}
}