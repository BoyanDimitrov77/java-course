package Sentence;

import java.util.Scanner;

public class CheckSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		String sentence = input.nextLine();

		System.out.println(sentence);

		boolean firstCheck = sentence.contains("Greeting");
		System.out.println("Sentence consists \"Greeting\":" + firstCheck);

		boolean secondCheck = sentence.endsWith(".");
		System.out.println("Sentence  ends with \".\":" + secondCheck);

		boolean thirdCheck = sentence.contains("water");
		System.out.println("Sentence consists \"water\":" + thirdCheck);

		input.close();

	}
}
