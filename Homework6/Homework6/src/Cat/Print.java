package Cat;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		Cat[] cats = new Cat[10];

		for (int i = 0; i < cats.length; i++) {
			System.out.println("Enter name:");
			String name = input.nextLine();

			System.out.println("Enter age:");
			int age = input.nextInt();
			input.nextLine();
			cats[i] = new Cat(name, age);

		}

		for (int i = 0; i < cats.length; i++) {
			cats[i].Say();
			System.out.println();

		}

		input.close();
	}

}
