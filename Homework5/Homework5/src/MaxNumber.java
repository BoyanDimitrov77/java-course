import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter first number:");
		int number1 = input.nextInt();
		System.out.println("Enter second number:");
		int number2 = input.nextInt();
		System.out.println("Enter third number:");
		int number3 = input.nextInt();

		System.out.println("Max number is " + maxNumber(maxNumber(number1, number2), number3));
		input.close();

	}

	public static int maxNumber(int first_num, int second_num) {
		if (first_num > second_num) {
			return first_num;
		} else {
			return second_num;
		}

	}
}
