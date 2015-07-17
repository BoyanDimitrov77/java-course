import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in,"UTF-8");
	
	System.out.println("Enter five number");
	double first=input.nextDouble();
	double second=input.nextDouble();
	double third=input.nextDouble();
	double fourth=input.nextDouble();
	double fifth=input.nextDouble();
	
	if(first>second && first>third && first>fourth && first>fifth){
		System.out.println(first);
	}else if(second>first && second>third && second>fourth && second>fifth){
		System.out.println(second);
	}else if(third>first &&  third>second && third>fourth && third>fifth){
		System.out.println(third);
	}else if(fourth>first && fourth>second && fourth>third && fourth>fifth){
		System.out.println(fourth);
	}else if(fifth>first && fifth>second && fifth>third && fifth>fourth){
		System.out.println(fifth);
	}
	
	input.close();
	}
}
