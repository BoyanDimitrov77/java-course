package CheckPriority;

import java.util.Scanner;

public class CheckPriority {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter math expression:");
		String math_expression = input.nextLine();

		boolean check = checkPriority(math_expression);
		System.out.println("Brackets are set:" + check);

		input.close();
	}

	public static boolean checkPriority(String math_expression) {

		boolean check = false;
		int count = 0;
		String twoCharacter = ")(";
		if (math_expression.contains(twoCharacter)) {
			return false;

		} else {

			for (int i = 0; i < math_expression.length(); i++) {

				if (math_expression.charAt(i) == ')' && count == 1) {
					count--;
					continue;
				}
				if (math_expression.charAt(i) == '(') {
					count++;
				}

				if (math_expression.charAt(i) == ')') {
					count--;
				}

			}

		}

		if (count == 0) {
			check = true;
		} else {
			check = false;
		}

		return check;
	}
}
