import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter size of array");
		int size = input.nextInt();

		System.out.println("Enter " + size + " number:");
		int array[] = new int[size];

		for (int index = 0; index < size; index++) {
			array[index] = input.nextInt();

		}
		Arrays.sort(array);

		System.out.println("Enter number search number:");
		int search = input.nextInt();

		int first_mem = 0;
		int last_mem = size - 1;
		int middle = (last_mem + first_mem) / 2;

		while (first_mem <= last_mem) {

			if (array[middle] < search) {
				first_mem = middle + 1;

			} else if (array[middle] == search) {
				System.out.println("Nubmer " + search + " is " + middle + " position");
				break;
			} else {
				last_mem = middle - 1;
			}
			middle = (last_mem + first_mem) / 2;

			if (first_mem > last_mem) {
				System.out.println("Search number " + search + " is not found");
			}
		}

		input.close();

	}

}
