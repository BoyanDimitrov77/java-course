package User;
import java.util.Scanner;

public class PrintResult {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		
		User[] users=new User[3];
		
		try{
			
			for(int i=0;i<users.length;i++){
				
				System.out.println("Enter email:");
				String email=input.nextLine();
				
				System.out.println("Enter password");
				String pass=input.nextLine();
				users[i]=new User(email,pass);
					
				System.out.println();
			}
			
		}catch(IllegalArgumentException exception) 	{
			System.out.println("Not real email or password.");
		}
			
		
		
		input.close();

	}

}
