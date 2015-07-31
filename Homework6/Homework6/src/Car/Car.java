package Car;

public class Car {
	protected double price;

	public Car(double price) {
		this.price = price;

		setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print() {
		System.out.println(this.price);
	}
}
