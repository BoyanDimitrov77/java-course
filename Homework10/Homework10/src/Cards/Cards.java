package Cards;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Cards {

	public static  void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter 5 cards");
		String [] cardChoosen= new String[5];
		
		/*cardChoosen[0]="J";
		cardChoosen[1]="J";
		cardChoosen[2]="7";
		cardChoosen[3]="7";
		cardChoosen[4]="10";
		*/
		
		System.out.println("First card:");
		cardChoosen[0]=input.nextLine();
		
		System.out.println("Second card:");
		cardChoosen[1]=input.nextLine();
		
		System.out.println("Third card:");
		cardChoosen[2]=input.nextLine();
		
		System.out.println("Forth card:");
		cardChoosen[3]=input.nextLine();
		
		System.out.println("Fifth card:");
		cardChoosen[4]=input.nextLine();
		
		
		System.out.println("You have in your hand:");
		CheckCards(cardChoosen);
		
		input.close();
	
}	
	
	public static void CheckCards(String[]cardChoosen){
		
HashMap<String,Integer> cards=new HashMap<String,Integer>();
		
		for(String card:cardChoosen){
		Integer count=cards.get(card);
		if(count==null){
			count=0;
		
		}
			cards.put(card, count+1);
		
		}
		
		Set<String> cardKey=cards.keySet();
		int flag=0; // check if you have one pair or two pair
		int counter=0;
		for(String card1:cardKey){
	      counter=cards.get(card1);
			
	      if(counter==2){   //check pair
				flag++;
	    	  continue;
			}
	        if(flag==1){
	        	System.out.println(" One Pair");
	        }
	        if(flag==2){
	        	System.out.println("Two Pair");
	        }
           	      
			if(counter==3){   //check set
			
				System.out.println("Set");
			}
			
			if(counter==4){   //check four of a kind
		
				System.out.println("Four of a kind ");
			}
	      
	      
			}
		
		
	}

}