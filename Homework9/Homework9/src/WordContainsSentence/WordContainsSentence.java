package WordContainsSentence;

import java.util.regex.Pattern;

public class WordContainsSentence {

	public static void main(String[] args) {
		String text = "This is an apple. This is an orange. I love apples and oranges.";
		String word = "apple";

		doPrintSentece(text, word);
	}

	public static void doPrintSentece(String text, String word) {

		String[] sentence = text.split("[.]");
		for (String partsSentence : sentence) {
			if (Pattern.compile(word).matcher(partsSentence).find()) {
				System.out.print(partsSentence + ".");
			}

		}
	}
}
