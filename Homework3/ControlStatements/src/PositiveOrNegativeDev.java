import java.util.Scanner;

public class PositiveOrNegativeDev {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter first number:");
		int number1 = input.nextInt();

		System.out.println("Enter second number:");
		int number2 = input.nextInt();
		if (number1 != 0 && number2 != 0) {

			if (number1 > 0 && number2 > 0) {
				System.out.println("+");
			} else if (number1 < 0 && number2 < 0) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
			if (number1 == 0 || number2 == 0) {
				System.out.println("Zero");
			}

		} else {

			System.out.println("Zero");
		}
		input.close();
	}

}
