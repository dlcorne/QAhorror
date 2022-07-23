package thetrainingarc;

import java.util.Scanner;

public class Blackjack {
	
	private static int i1;
	private static int i2;
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter first integer:");
		i1 = in1.nextInt();
		System.out.println("Enter second integer:");
		i2 = in1.nextInt();
		in1.close();
		blackjack(i1, i2);
		System.out.println();
	}
	public static int blackjack(int i1, int i2) {
		int gameResult;
		int gameLeader;
		if (i1 > i2) {
			gameLeader = i1;
		} else {
			gameLeader = i2;
		}
		if (i1 > 21) {
			gameLeader = i2;
		}
		if (i2 > 21) {
			gameLeader = i1;
		} 
		if (gameLeader > 21) {
			gameResult = 0;
		} else {	
			gameResult = gameLeader;
		}
		System.out.println("The closest to 21 without going over: " + gameResult);
		return gameResult;
		
	}
}
