import java.util.Scanner;

public class NumberEnglishWord {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");

		int number=input.nextInt();
		
		int hundred=number/100;
		int tenth=(number/10)%10;
		int ones=number%10;
		
		if(number>=0 && number<=999)
		{
			
			switch(hundred){
			case 1:
				System.out.print("One hundred");
				break;
			case 2:
				System.out.print("Two hundred");
				break;
			case 3:
				System.out.print("Three hundred");
				break;
			case 4:
				System.out.print("Four hundred");
				break;
			case 5:
				System.out.print("Five hundred");
				break;
			case 6:
				System.out.print("Six hundred");
				break;
			case 7:
				System.out.print("Seven hundred");
				break;
			case 8:
				System.out.print("Eight hundred");
				break;
			case 9:
				System.out.print("Nine hundred");
				break;
			case 0:
				break;
			}
			
			if(hundred!=0 && ones!=0 && tenth==0){
				System.out.print(" and");
			}
			
			switch(tenth){
			
			case 1:
				switch(ones){
				case 1:
					System.out.print(" eleven");
					break;
				case 2:
					System.out.print(" twelf");
					break;
				case 3:
					System.out.print(" thirteen");
					break;
				case 4:
					System.out.print(" fourteen");
					break;
				case 5:
					System.out.print(" fifteen");
					break;
				case 6:
					System.out.print(" sixteen");
					break;
				case 7:
					System.out.print(" seventeen");
					break;
				case 8:
					System.out.print(" eighteen");
					break;
				case 9:
					System.out.print(" nineteen");
					break;
				case 0:
					System.out.print(" ten");
				break;
				
				} break;
				
			case 2:
				System.out.print(" twenty");
				break;
			case 3:
				System.out.print(" thirty");
				break;
			case 4:
				System.out.print(" forty");
				break;
			case 5:
				System.out.print(" fifty");
				break;
			case 6:
				System.out.print(" sixty");
				break;
			case 7:
				System.out.print(" seventy");
				break;
			case 8:
				System.out.print(" eighty");
				break;
			case 9:
				System.out.print(" ninety");
				break; 
			
			}
			
		if(tenth!=1){
			
			
			switch(ones){
			case 1:
				System.out.print(" one");
				break;
			case 2:
				System.out.print(" two");
				break;
			case 3:
				System.out.print(" three");
				break;
			case 4:
				System.out.print(" four");
				break;
			case 5:
				System.out.print(" five");
				break;
			case 6:
				System.out.print(" six");
				break;
			case 7:
				System.out.print(" seven");
				break;
			case 8:
				System.out.print(" eight");
				break;
			case 9:
				System.out.print(" nine");
				break;
			}
			
			
		}
		
		if(hundred==0 && tenth==0 && ones==0){
			System.out.println("Zero");
		}
		input.close();
		
		}
		else
			System.out.println("Out of range");
	}

}
