
public class ReverseArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int print : array) {
			System.out.print(print);
		}
		System.out.println();

		doReverse(array);

		doReverse("Hello");

	}

	public static void doReverse(int array[]) {

		int reverseArray[] = new int[10];
		for (int i = 0; i < 10; i++) {
			reverseArray[10 - i - 1] = array[i];

		}
		for (int print : reverseArray) {
			System.out.print(print);
		}

	}

	public static void doReverse(String word) {

		int length = word.length();
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);

		}
		System.out.println();
		System.out.println("Original string is " + word);
		System.out.println("Reverse string is " + reverse);

	}

}