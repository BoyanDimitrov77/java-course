import java.util.Scanner;
import java.util.Arrays;

public class FibonacciArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter size of array");
		int length = input.nextInt();

		int array[] = new int[length];

		array[0] = 0;
		array[1] = 1;

		for (int i = 2; i < length; i++) {
			array[i] = array[i - 1] + array[i - 2];

		}
		System.out.println(Arrays.toString(array));
		input.close();
	}

}
