package Library;
import java.util.ArrayList;
import java.util.Scanner;

public class BooksInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter name of library:");
		String name = input.nextLine();

		System.out.println("Enter addres");
		String adress = input.nextLine();

		ArrayList<Book> book = new ArrayList<Book>();

		Library library = new Library(name, adress, book);

		System.out.println("Enter number of book");
		int number = input.nextInt();
		input.nextLine();

		System.out.println(library);

		for (int i = 1; i <= number; i++) {
			System.out.println("Enter name of book:");
			String nameBook = input.nextLine();

			System.out.println("Enter author");
			String author = input.nextLine();

			System.out.println("Pages");
			int pages = input.nextInt();
			input.nextLine();

			library.AddBook(nameBook, author, pages);

		}
		System.out.println(book);

		System.out.println("Enter name of book you want to remove:");
		String removeBook = input.nextLine();
		library.removeBook(removeBook);

		input.close();
	}

}
