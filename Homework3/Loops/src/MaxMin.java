import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("How many numbers do you want to input?");
		int all_Number = input.nextInt();

		float max = Float.MIN_VALUE;
		float min = Float.MAX_VALUE;

		System.out.println("Enter your " + all_Number + " numbers");

		for (int i = 1; i <= all_Number; i++) {

			float check_Number = input.nextFloat();
			float var = check_Number;

			if (var > max) {
				max = var;
			}
			if (var < min) {
				min = var;
			}

		}

		System.out.println("Max value is " + max);
		System.out.println("Min value is " + min);

		input.close();
	}

}
