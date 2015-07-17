import java.util.Scanner;

public class CheckTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter the size of first side of the triangle(a):");
		int FirstSide=input.nextInt();
		
		System.out.println("Enter the size of second side of the triangle(b):");
		int SecondSide=input.nextInt();
		
		System.out.println("Enter the size of third side of the triangle(c):");
		int ThirdSide=input.nextInt();
		
		if((ThirdSide<FirstSide+SecondSide) && (FirstSide<ThirdSide + SecondSide) && (SecondSide<ThirdSide+FirstSide))
		{
			System.out.println("It is possible to make a triagle");
			
		}
		
		else
			System.out.println("It is not possible to make a triagle");

		input.close();
	}

}
