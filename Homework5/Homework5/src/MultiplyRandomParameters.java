import java.util.Random;

public class MultiplyRandomParameters {

	public static void main(String[] args) {

		Random rand = new Random();

		for (int i = 0; i < 20; i++) {

			int parameter1 = rand.nextInt();
			int parameter2 = rand.nextInt();
			int parameter3 = rand.nextInt();

			int result_final = multiplyParameters(parameter1, parameter2, parameter3);
			System.out.println(result_final);
		}

	}

	public static int multiplyParameters(int a, int b, int c) {
		int result = a * b * c;

		return result;
	}

}
