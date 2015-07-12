import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in,"UTF-8");
	
	System.out.println("Chek your number-Even/Odd:");
	
	int number=input.nextInt();
	
     boolean evenNumber=number%2==0;
     System.out.println(evenNumber);
     
     /*
      int result=number%2;
       
      if(result==0)
    {
    	System.out.println("The number is even");
    }
     
    else
           System.out.println("The number is odd");
      */
     
	input.close();
	
	
	
	
	
	
	}

}
