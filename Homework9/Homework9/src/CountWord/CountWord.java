package CountWord;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter text");
		String text = input.nextLine();

		System.out.println("Enter word from text");
		String word = input.nextLine();

		int countWord = countWord(text, word);
		System.out.println("word \"" + word + "\":" + countWord + " times.");

		input.close();
	}

	public static int countWord(String text, String word) {
		int count = 0;

		String[] splitText = text.split("[ ,.]+");

		for (String words : splitText) {
			if (words.equalsIgnoreCase(word)) {
				count++;
			}

		}

		return count;
	}

}
