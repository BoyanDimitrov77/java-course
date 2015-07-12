import java.util.Scanner;
//import static java.lang.Math.*;

public class AreaAndPerimeterCircle {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in,"UTf-8");
		
		System.out.println("Enter the raduis of circle:");
		
		double radius=input.nextFloat();
		
		double perimeter=2*(Math.PI)*radius;
	    System.out.println("Perimeter is "+perimeter);
	    
	    double area=(Math.PI)*Math.pow(radius, 2);
	    System.out.println("Area is "+area);
	    
	    input.close();

		
	}

}
