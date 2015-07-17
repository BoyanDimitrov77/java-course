import java.util.Scanner;

public class CalculateFactorialOther {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter N:");
		int N = input.nextInt();
		System.out.println("Enter K:");
		int K = input.nextInt();

		int result_N = 1;
		int result_K = 1;
		int result_NK = 1;

		if (N != K && N > 0 && K > 0 && N>K) {

			for (int i = 1; i <= N; i++) {

				result_N *= i;

			}

			for (int i = 1; i <= K; i++) {
				result_K *= i;
			}

			int c = N - K;
			for (int i = 1; i <= c; i++) {

				result_NK *= i;
			}

			System.out.println("N!*K!/(N-K)!=" + (result_N * result_K / result_NK));

		} else {
			System.err.println("Error");
		}
		input.close();
	}

}
