package thetrainingarc;

import java.util.ArrayList;

public class Garage {
	
// Forewarning, this is really bad. This program is just the basic functionality 
// you showed us plus a graveyard of attempts to satisfy the third criteria.
	
	public static Car c1;
	public static Bike b1;
	public static Plane p1;
	public static int repaircost;
	
	public static ArrayList<Vehicle> inv = new ArrayList<>();
	
	public static void main(String[] args) {
		Car c1 = new Car("Aston Martin", "Sports Car", 13530, "Silver", true);
		Bike b1 = new Bike("Peloton", "Mountain Bike", 2420, "Red", false);
		Plane p1 = new Plane("Lockheed Martin", "Fighter Jet", 199999, "White", true);
		
		ArrayList<Vehicle> inv = new ArrayList<>();
		inv.add(c1);
		inv.add(b1);
		inv.add(p1);
		
		
		for (Vehicle v : inv) {
			if (v instanceof Car) {
				Car c = (Car) v;
				c.horn();
			}
			v.print();
			v.tyreScreech();
		}
		costCalc();
		System.out.println(repaircost);
	}
	
// Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, 
// depending on the type of Vehicle it is (this does not need to be complex).
	
	/* Attempting to make a variable for type, didn't find a way to convert from object to string.
	public static void getType(String type) {
		String s = (String.ValueOf(inv.get(1)));
	*/	
	
	// Attempting to reverse-engineer the code for horn to add to a cumulative cost. Tried as int return, always returns 0. Pain.
	public static void costCalc() {
		for (Vehicle v : inv) {
			if (v == c1) {
				repaircost++;
			}
		 	if (v instanceof Bike) {
		 		repaircost = (repaircost + 3000);
		 	}
		 	if (v instanceof Plane) {
		 		repaircost = (repaircost + 50000);
		 	}
		}
	}
}
	
//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.


//Garage should have a method to remove multiple Vehicles by their type.

