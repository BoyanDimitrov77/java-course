import java.util.Scanner;

public class RemainderAfterDivision {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter first number:");
		int FirstNumber=input.nextInt();
		System.out.println("Enter second number:");
		int SecondNumber=input.nextInt();
		
		int result=FirstNumber%SecondNumber;
		
		System.out.println("The remainder when we divided two number is "+result );
		
       input.close();
		
	}

}
