package ReverseWord;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter word which you want to reverse:");
		String reverse = input.nextLine();

		String newWord = reverseWord(reverse);

		System.out.println(newWord);
		input.close();

	}

	public static String reverseWord(String word) {

		StringBuilder sb = new StringBuilder();

		for (int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));

		}

		return sb.toString();
	}
}