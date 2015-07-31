package Stock;

import java.util.Scanner;

public class Shop {
	private String shopName;
	private String location;

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number of product:");
		int numAddProduct = input.nextInt();
		Stock stocks[] = new Stock[numAddProduct];

		addProduct(stocks, numAddProduct, input);
		boolean checkProduct = checkProduct(stocks, input);
		System.out.println("This product is available:" + checkProduct);

		input.close();

	}

	public static void addProduct(Stock[] stocks, int numAddProduct, Scanner input) {

		for (int i = 0; i < stocks.length; i++) {

			System.out.println(
					"Enter category of product you want to input(1.Meat/2.Vegetables/3.Fruits/4.Bavarage/5.Dessert):");
			int choice = input.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter price per kilogram:");
				double price = input.nextDouble();
				input.nextLine();
				System.out.println("Enter type of product:");
				String typeP = input.nextLine();
				System.out.println("Enter name:");
				String name = input.nextLine();
				System.out.println("Enter origin:");
				String origin = input.nextLine();

				Meat meats = new Meat(price, true, typeP, origin, name);
				stocks[i] = meats;

				System.out.println();

			}
				break;
			case 2: {
				System.out.println("Enter price per kilogram:");
				double price = input.nextDouble();
				input.nextLine();
				System.out.println("Enter sort vegetables:");
				String sortP = input.nextLine();
				System.out.println("Enter name:");
				String name = input.nextLine();
				System.out.println("Enter Yes/No if this vegetables is GMO:");
				String gmo = input.nextLine();
				System.out.println("Enter Yes/No if this vegetables is BIO:");
				String bio = input.nextLine();

				Vegetable vegetables = new Vegetable(price, true, sortP, gmo, bio, name);
				stocks[i] = vegetables;

				System.out.println();

			}
				break;

			case 3: {
				System.out.println("Enter price per kilogram:");
				double price = input.nextDouble();
				input.nextLine();
				System.out.println("Enter type fruit:");
				String typeP = input.nextLine();
				System.out.println("Enter name:");
				String name = input.nextLine();
				System.out.println("Taste:");
				String taste = input.nextLine();

				Fruits fruit = new Fruits(price, true, typeP, taste, name);
				stocks[i] = fruit;

				System.out.println();

			}
				break;
			case 4: {
				System.out.println("Enter price:");
				double price = input.nextDouble();
				input.nextLine();
				System.out.println("Enter name:");
				String name = input.nextLine();
				System.out.println("Enter Yes/No if this beverage is soft :");
				String soft_drink = input.nextLine();
				System.out.println("Enter Yes/No if this baverage is alcoholic:");
				String alcoholic_drink = input.nextLine();

				Beverage beverages = new Beverage(price, true, soft_drink, alcoholic_drink, name);
				stocks[i] = beverages;

				System.out.println();

			}
				break;
			case 5: {
				System.out.println("Enter price:");
				double price = input.nextDouble();
				input.nextLine();
				System.out.println("Enter name:");
				String name = input.nextLine();
				System.out.println("Enter Yes/No if this is fruit dessert :");
				String fruits_dessert = input.nextLine();
				System.out.println("Enter Yes/No if this is sweet dessert:");
				String sweet_dessert = input.nextLine();

				Dessert desserts = new Dessert(price, true, fruits_dessert, sweet_dessert, name);
				stocks[i] = desserts;

				System.out.println();

			}
				break;

			default:
				System.err.println("Invalid data");

			}

		}

	}

	public static boolean checkProduct(Stock[] stocks, Scanner input) {

		System.out.println("Check product-Enter price of product:");
		double checkP = input.nextDouble();
		input.nextLine();
		System.out.println("Enter name of product:");
		String nameP = input.nextLine();
		System.out.println();
		int count = 0;
		boolean check = false;

		for (int i = 0; i < stocks.length; i++) {

			if (stocks[i].getPrice() == checkP && stocks[i].getName().equals(nameP)) {
				check = stocks[i].available;
				count++;

				if (stocks[i] instanceof Meat) {
					System.out.println("Type name:" + ((Meat) stocks[i]).getTypeMeat());
					System.out.println("Name:" + ((Meat) stocks[i]).getName());
					System.out.println("Origin:" + ((Meat) stocks[i]).getOrigin());
					System.out.println("Price per kilogram:" + ((Meat) stocks[i]).getPrice());

				} else if (stocks[i] instanceof Vegetable) {
					System.out.println("Type name:" + ((Vegetable) stocks[i]).getSortVegetables());
					System.out.println("Name:" + ((Vegetable) stocks[i]).getName());
					System.out.println("BIO:" + ((Vegetable) stocks[i]).getBio());
					System.out.println("GMO:" + ((Vegetable) stocks[i]).getGmo());
					System.out.println("Price per kilogram:" + ((Vegetable) stocks[i]).getPrice());

				} else if (stocks[i] instanceof Fruits) {
					System.out.println("Type fruit:" + ((Fruits) stocks[i]).getTypeFruit());
					System.out.println("Name:" + ((Fruits) stocks[i]).getName());
					System.out.println("Tate:" + ((Fruits) stocks[i]).geTaste());
					System.out.println("Price per kilogram:" + ((Fruits) stocks[i]).getPrice());

				} else if (stocks[i] instanceof Beverage) {
					System.out.println("Name:" + ((Beverage) stocks[i]).getName());
					System.out.println("Soft drink:" + ((Beverage) stocks[i]).getSoft_drink());
					System.out.println("Alcoholic beverage:" + ((Beverage) stocks[i]).getAlcoholic_beverage());
					System.out.println("Price:" + ((Beverage) stocks[i]).getPrice());

				} else if (stocks[i] instanceof Dessert) {
					System.out.println("Name:" + ((Dessert) stocks[i]).getName());
					System.out.println("Fruit dessert:" + ((Dessert) stocks[i]).getFruits_dessert());
					System.out.println("Sweet:" + ((Dessert) stocks[i]).getSweet_dessert());
					System.out.println("Price:" + ((Dessert) stocks[i]).getPrice());

				}

				System.out.println();

			}

		}
		System.out.println("Number of products are :" + count);
		return check;
	}

}
