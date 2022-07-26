package thetrainingarc;

public class Vehicle extends Object {

	private String name;
	private String type;
	private int mileage;
	private String colour;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Vehicle(String name, String type, int mileage, String colour) {
		super();
		this.name = name;
		this.type = type;
		this.mileage = mileage;
		this.colour = colour;
	}

	public void print() {
		System.out.println("This product is from " + name + ".");
		System.out.println("It is a " + type + " with " + this.mileage + " miles clocked on it.");
		System.out.println("The body's colour is " + colour + ".");
	}

	public void tyreScreech() {
		System.out.println("hello?");
	}

	public void setmileage(int mileage) {
		if (mileage > 0 && mileage < 200000)
			this.mileage = mileage;
		else
			System.out.println("Invalid mileage: " + mileage);
	}

	public int getmileage() {
		return this.mileage;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String gettype() {
		return this.type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}