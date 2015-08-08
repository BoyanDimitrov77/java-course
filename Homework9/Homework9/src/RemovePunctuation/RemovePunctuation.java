package RemovePunctuation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class RemovePunctuation {

	public static void main(String[] args) {

		readFile("Text.txt", "NewWriteFile.txt");
		System.out.println("The file is success.");

	}

	public static void readFile(String nameFile, String nameFile1) {
		try {
			FileReader fileReader = new FileReader(nameFile);

			BufferedReader readFile = new BufferedReader(fileReader);

			String replaceline = "";
			while (readFile.ready()) {

				String line = readFile.readLine();
				replaceline = line.replaceAll("\\W", "");
				writeFile(nameFile1, replaceline);

			}
			readFile.close();

		} catch (Exception e) {
			System.out.println("Read Error");
			System.out.println(e.getMessage());
			System.exit(0);

		}

	}

	public static void writeFile(String nameFile1, String line) {
		try {
			FileWriter fileWriter = new FileWriter(nameFile1, true);
			BufferedWriter writer = new BufferedWriter(fileWriter);

			writer.write(line);
			writer.newLine();

			writer.close();
		} catch (Exception e) {
			System.out.println("Write Error");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}
}
