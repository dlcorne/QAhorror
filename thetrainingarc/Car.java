package thetrainingarc;

public class Car extends Vehicle {
	
	private boolean engineTuned;

	public Car() {
		super();
	}

	public Car(boolean engineTuned) {
		super();
		this.engineTuned = engineTuned;
	}

	public Car(String name, String type, int mileage, String colour, boolean engineTuned) {
		super(name, type, mileage, colour);
		this.engineTuned = engineTuned;
	}

	public Car(String name, String type, int mileage, String colour) {
		super(name, type, mileage, colour);
	}

	public Car(String name, String type) {
		super(name, type);
	}

	@Override
	public void tyreScreech() {
		System.out.println("SKKKRRTT");
	}

	public void horn() {
		System.out.println("Brrrt!");
	}

	public boolean isengineTuned() {
		return this.engineTuned;
	}

	public void setengineTuned(boolean engineTuned) {
		this.engineTuned = engineTuned;
	}
}
