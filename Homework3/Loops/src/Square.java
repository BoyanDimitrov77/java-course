import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("N:");
		int N = input.nextInt();

		System.out.println("M:");
		int M = input.nextInt();

		int result = 1;

		for (int i = 1; i <= M; i++) {

			result *= N;
		}
		System.out.println("N^M=" + result);
		input.close();

	}

}