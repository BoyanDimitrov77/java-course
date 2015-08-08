package Countries;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CountriesAndCities {

	public static void main(String[] args) {

		readFile("contries.txt", "cities.txt");

	}

	public static void readFile(String fileName1, String fileName2) {

		try {
			Scanner input = new Scanner(System.in, "UTF-8");
			FileReader fileReader = new FileReader(fileName1);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = null;
			while ((line = bufferedReader.readLine()) != null) {

				System.out.println("What is the capital of " + line + " ?");
				String nameCapital = input.nextLine();
				writeFile(fileName2, nameCapital);

			}

			input.close();
			bufferedReader.close();
		} catch (Exception e) {
			System.out.println("Read Error");
			System.out.println(e.getMessage());
			System.exit(0);
		} finally {

			System.out.println("Operation complete.");
		}

	}

	public static void writeFile(String fileName2, String nameCapital) {
		try {

			FileWriter fileWrite = new FileWriter(fileName2, true);
			BufferedWriter writer = new BufferedWriter(fileWrite);

			writer.write(nameCapital);
			writer.newLine();

			writer.close();
		} catch (Exception e) {
			System.out.println("Write Error");
			System.out.println(e.getMessage());
			System.exit(0);

		}

	}
}
