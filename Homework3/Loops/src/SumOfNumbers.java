import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter number and exit with 0");

		int sum = 0;

		while (true) {
			int number = input.nextInt();

			if (number != 0) {
				sum += number;
			} else
				break;
		}

		System.out.println(sum);

		input.close();
	}

}
