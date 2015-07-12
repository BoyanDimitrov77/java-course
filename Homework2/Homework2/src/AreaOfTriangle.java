import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter height:");
		int height=input.nextInt();
		
		System.out.println("Enter the size of side: ");
		int side=input.nextInt();
		
		int area=(side*height)/2;
		System.out.println("Area of triangle is "+area);
		
		input.close();
		
	}

}