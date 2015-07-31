package Convert;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
	private static double celsius;
	private static double fahrenheit;

	public ConvertCelsiusToFahrenheit(double celsius, double fahrenheit) {
		super();

		ConvertCelsiusToFahrenheit.celsius = celsius;
		ConvertCelsiusToFahrenheit.fahrenheit = fahrenheit;

		setCelsius(celsius);
		setFahrenheit(fahrenheit);
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		ConvertCelsiusToFahrenheit.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		ConvertCelsiusToFahrenheit.fahrenheit = fahrenheit;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter a degree in Celsius:");
		ConvertCelsiusToFahrenheit.celsius = input.nextDouble();

		ConvertCelsiusToFahrenheit.fahrenheit = (ConvertCelsiusToFahrenheit.celsius * 9 / 5) + 32;

		System.out.println(ConvertCelsiusToFahrenheit.celsius + " Celsius is " + ConvertCelsiusToFahrenheit.fahrenheit
				+ " Fahrenheit");

		input.close();
	}

}
