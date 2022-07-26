package thetrainingarc;

import java.util.ArrayList;

public class PeopleRunner {
	
	public static ArrayList<People> peopleList = new ArrayList<People>();
	
	public static void main(String[] args) {
		ArrayList<People> peopleList = new ArrayList<>();
		People p1 = new People();
		p1.name = "Josh";
		p1.jobtitle = "Godbotherer";
		p1.age = 73;
		
		People p2 = new People();
		p2.name = "Graham";
		p2.jobtitle = "Soundcloud Rapper";
		p2.age = 26;
		
		People p3 = new People();
		p3.name = "Ralph";
		p3.jobtitle = "Designer Clothier";
		p3.age = 66;
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		System.out.println(peopleList);
		
		searchPeople("Graham", peopleList);
	}
	private static People searchPeople(String name, ArrayList<People> peopleList) { 
		for (People p : peopleList) {
			if (p.name == name) 
				return p;
				
			}
		return null;
		}	
		
	}

	
