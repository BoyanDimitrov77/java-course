import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter first number:");
		int number1=input.nextInt();
		
		System.out.println("Enter second number:");
        int number2=input.nextInt();
        
        System.out.println("Enter third number:");
        int number3=input.nextInt();
        
        int max;
        
        max=number1;
        
        if(number2>max){
        	
        	max=number2;
        }
        
        if(number3>max){
        	max=number3;
        }
        
        System.out.println("The biggest number is "+max);
        
        input.close();

	}

}
