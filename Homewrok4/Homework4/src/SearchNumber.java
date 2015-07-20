import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter size of array:");
		int size = input.nextInt();
		int array[] = new int[size];

		System.out.println("Enter " + size + " numbers: ");

		for (int index = 0; index < size; index++) {
			array[index] = input.nextInt();
		}

		boolean found = false;
		int i;
		System.out.println("Enter search number:");
		int search_num = input.nextInt();
		for (i = 0; i < size; i++) {
			if (array[i] == search_num) {
				found = true;
				break;
			}

		}
		if (found) {
			System.out.println("Number " + search_num + " is on position " + i);
		} else {
			System.out.println(search_num + " is not found");
		}

		input.close();
	}

}
