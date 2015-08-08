package ChangeWordUpperCase;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WordUpperCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please Enter word:");
		String word = input.nextLine();

		System.out.println("Please enter text");
		String text = input.nextLine();

		String newText = changeToUpperCase(word, text);
		System.out.println(newText);

		input.close();

	}

	public static String changeToUpperCase(String word, String text) {

		String replaceWord = "";
		if (Pattern.compile(word).matcher(text).find()) {
			String newWord = word.toUpperCase();
			replaceWord = text.replaceAll(word, newWord);

		}

		return replaceWord.toString();

	}
}
