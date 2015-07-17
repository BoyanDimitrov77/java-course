import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter number:");
		int number=input.nextInt();
		
		if(number>=1 && number<=5){
		
			if(number%2==0){
				System.out.println(number+ " is even.");
			
			}else{
				System.out.println(number + " is odd.");
			}
		}
		

		if(number>=6 && number<=15){
			
			if(number%3==0){
			int result=number/3;
			System.out.println(number+ " is divided by 3 without remainder");
			System.out.println(number+ "/3="+result);
			
			}else{
				System.out.println("The number is not diveded by 3");
			
			}
		}
		
		if(number<=0 || number>=16){
			if(number<0)
				System.out.println(number+ " is negative");
			if(number==0)
				System.out.println("0");
			if(number>0)
			System.out.println(number+ " is positive");
				
		}
			
		
    /*
		switch(number){
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:{
			if(number%2==0){
				System.out.println("The number is even");
			}else{
				System.out.println("The number is odd");
			}		
		}
		break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:{
			if(number%3==0){
				System.out.println("The number is divided without remainder");
			}else{
				System.out.println("The number is divided with remaider " +number%3 );
				
			}
			
			
		}
		break;
		
     }
		if(number<=0 || number>=16){
			if(number<0){
				System.out.println("Number is negative");
			}
			if(number==0){
				System.out.println("Zero");
			}
			if(number>0){
				System.out.println("Number is positive");
				
			}
		}
	*/	
		input.close();
	}

}
