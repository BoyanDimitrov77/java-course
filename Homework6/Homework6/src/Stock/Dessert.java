package Stock;

public class Dessert extends Stock {
	private String fruits_dessert;
	private String sweet_dessert;

	public Dessert(double price, boolean available, String fruits_dessert, String sweet_dessert, String name) {
		super(price, available, name);

		this.fruits_dessert = fruits_dessert;
		this.sweet_dessert = sweet_dessert;

		setFruits_dessert(fruits_dessert);
		setSweet_dessert(sweet_dessert);

	}

	public String getFruits_dessert() {
		return fruits_dessert;
	}

	public void setFruits_dessert(String fruits_dessert) {
		this.fruits_dessert = fruits_dessert;
	}

	public String getSweet_dessert() {
		return sweet_dessert;
	}

	public void setSweet_dessert(String sweet_dessert) {
		this.sweet_dessert = sweet_dessert;
	}

}
