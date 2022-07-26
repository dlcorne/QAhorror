package thetrainingarc;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	
	public static void main(String[] args) {
		ArrayList<Integer> signal = new ArrayList<Integer>();
		signal.add(346);
		signal.add(43);
		signal.add(15);
		signal.add(11);
		signal.add(12);
		System.out.println(signal);
		int third = signal.get(2);
		signal.set(2, 45);
		signal.remove(3);
		System.out.println(signal);
		Collections.sort(signal);
		System.out.println("After sort:" + signal);
		Collections.sort(signal, Collections.reverseOrder());
		System.out.println("After sort 2:" + signal);
		Collections.swap(signal, 1, 3);
		System.out.println("After swap: " + signal);
		
		//normie for loop
		for (int counter = 0; counter < signal.size(); counter++) {
			System.out.println(signal.get(counter));
		}
		
		//adv for loop
		for (Integer num : signal) {
			System.out.println(num);
		}
		
		signal.clear();
		System.out.println("After clear:" + signal);
	}
	
}