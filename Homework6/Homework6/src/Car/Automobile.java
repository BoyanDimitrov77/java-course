package Car;

public class Automobile extends Car {
	private float fuel;

	public Automobile(double price) {
		super(price);

	}

	public float getFuel() {
		return fuel;
	}

	public void setFuel(float fuel) {
		this.fuel = fuel;
	}
}
