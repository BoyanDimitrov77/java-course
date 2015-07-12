import java.util.Scanner;
public class DivWithoutRemaider {

	public static void main(String[] args) {
		
	Scanner input=new Scanner (System.in,"UTF-8");
	
	System.out.println("Enter number:");
	int number=input.nextInt();
	int resultFirst=number%5;
	int resultSecond=number%7;
	
	boolean result=(resultFirst==0) && (resultSecond==0);
	
	System.out.println("This number is divided by 5 and 7 without a remainder: " + result);
	

	 input.close();
	}

}
