import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N:");
		int number = input.nextInt();

		System.out.println("N=" + number);
		int factorial = calculateFactorial(number);
		System.out.println(number + "!=" + factorial);
		input.close();

	}

	public static int calculateFactorial(int n) {
		if (n == 0) {
			return 1;

		} else
			return n * calculateFactorial(n - 1);
	}

}
