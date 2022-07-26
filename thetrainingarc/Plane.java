package thetrainingarc;

public class Plane extends Vehicle {
	
	private boolean fuelTankFull;

	public Plane() {
		super();
	}

	public Plane(boolean fuelTankFull) {
		super();
		this.fuelTankFull = fuelTankFull;
	}

	public Plane(String name, String type, int mileage, String colour, boolean fuelTankFull) {
		super(name, type, mileage, colour);
		this.fuelTankFull = fuelTankFull;
	}

	public Plane(String name, String type, int mileage, String colour) {
		super(name, type, mileage, colour);
	}

	public Plane(String name, String type) {
		super(name, type);
	}

	@Override
	public void tyreScreech() {
		System.out.println("BRRRRRRRRRRRRRRR");
	}

	public void horn() {
		System.out.println("do planes even have these");
	}

	public boolean isfuelTankFull() {
		return this.fuelTankFull;
	}

	public void setfuelTankFull(boolean fuelTankFull) {
		this.fuelTankFull = fuelTankFull;
	}
}
