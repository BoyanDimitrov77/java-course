import java.util.Scanner;

public class SimmetricalArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter size of array:");
		int size = input.nextInt();
		int array[] = new int[size];

		System.out.println("Enter" + size + " numbers:");
		for (int index = 0; index < size; index++) {
			array[index] = input.nextInt();
		}

		boolean simmetrical = true;

		for (int i = 0; i < (size + 1) / 2; i++) {
			if (array[i] != array[size - 1 - i]) {
				simmetrical = false;
			}

		}
		System.out.println("Simmetrical:" + simmetrical);
		input.close();
	}

}
