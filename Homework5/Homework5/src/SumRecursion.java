import java.util.Scanner;

public class SumRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter number between[10;30000]");
		long number = input.nextInt();
		if (number >= 10 && number <= 30000) {

			long sum = calculateSum(number);
			System.out.println("Sum of 1 to " + number + "  is " + sum);

		} else
			System.err.println("Enter invalid number");

		input.close();
	}

	public static long calculateSum(long number) {
		if (number == 0) {
			return 0;
		} else
			return number + calculateSum(number - 1);

	}

}
