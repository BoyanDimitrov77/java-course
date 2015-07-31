package Stock;

public class Beverage extends Stock {
	private String soft_drink;
	private String alcoholic_beverage;

	public Beverage(double price, boolean available, String soft_drink, String alcoholic_beverage, String name) {
		super(price, available, name);
		this.soft_drink = soft_drink;
		this.alcoholic_beverage = alcoholic_beverage;

		setSoft_drink(soft_drink);
		setAlcoholic_beverage(alcoholic_beverage);
	}

	public String getSoft_drink() {
		return soft_drink;
	}

	public void setSoft_drink(String soft_drink) {
		this.soft_drink = soft_drink;
	}

	public String getAlcoholic_beverage() {
		return alcoholic_beverage;
	}

	public void setAlcoholic_beverage(String alcoholic_beverage) {
		this.alcoholic_beverage = alcoholic_beverage;
	}

}
