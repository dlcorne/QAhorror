package thetrainingarc;

public class Bike extends Vehicle {
	
	private boolean tyresPumped;

	public Bike() {
		super();
	}

	public Bike(boolean tyresPumped) {
		super();
		this.tyresPumped = tyresPumped;
	}

	public Bike(String name, String type, int mileage, String colour, boolean tyresPumped) {
		super(name, type, mileage, colour);
		this.tyresPumped = tyresPumped;
	}

	public Bike(String name, String type, int mileage, String colour) {
		super(name, type, mileage, colour);
	}

	public Bike(String name, String type) {
		super(name, type);
	}

	@Override
	public void tyreScreech() {
		System.out.println("skrrrt");
	}

	public void horn() {
		System.out.println("Ding!");
	}

	public boolean aretyresPumped() {
		return this.tyresPumped;
	}

	public void settyresPumped(boolean tyresPumped) {
		this.tyresPumped = tyresPumped;
	}
}
