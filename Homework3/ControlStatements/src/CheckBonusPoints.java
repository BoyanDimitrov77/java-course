import java.util.Scanner;

public class CheckBonusPoints {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Calculate your points.");
		System.out.println("Please enter your points [1;9]:");
		
	    int points=input.nextInt();
	    
	    if(points>=1 && points<=9){
	    	
	    	if(points>=1 && points<=3){
	    		
	    		System.out.println("Your bonus points are " +points*5);
	    	}else if(points>=4 && points<=6){
	    		System.out.println("Your bonus points are " +points*10);
	    		
	    	}else if(points>=7 && points<=9){
	    		
	    		System.out.println("Your bonus points are " +points*50);
	    	}
	    	
	    } else{
	    	System.out.println("You entered invalid number of points");
	    }
	    input.close();
	}

}
