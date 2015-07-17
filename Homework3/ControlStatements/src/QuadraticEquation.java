import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Quadratic Equation (ax^2 +bx +c).");
		System.out.println("Enter value of 'a':");
		int a=input.nextInt();
		
		System.out.println("Enter value of 'b':");
		int b=input.nextInt();
		
		System.out.println("Enter value of 'c':");
		int c=input.nextInt();
		
		double x1;
		double x2;
		int dis;
		
		dis=(b*b)-(4*a*c);
		
		if(dis>0){
			x1=(-(double)b+Math.sqrt(dis)) / ((double)2*a);
			x2=(-(double)b-Math.sqrt(dis)) / ((double)2*a);
			
			
			System.out.println(x1);
			System.out.println(x2);
		}else if(dis==0){
			
			x1=-(double)b/(double)2*a;
			System.out.println(x1);
		}else if(dis<0){
			
			System.out.println("There are no real solutions ");
			
		}
		
		input.close();
	}

}
