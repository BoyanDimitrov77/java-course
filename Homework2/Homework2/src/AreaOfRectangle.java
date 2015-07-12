import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		
        Scanner input = new Scanner(System.in, "UTF-8");
        
        System.out.println("Area of a rectangle");
       
        
        System.out.println("Enter width:");
       float width=input.nextFloat();
       
       System.out.println("Enter length:");
       float lenght=input.nextFloat();
       
       float result=width*lenght;
       
       
       System.out.println("The area is " + result);
       
        input.close();
        
    }

}
