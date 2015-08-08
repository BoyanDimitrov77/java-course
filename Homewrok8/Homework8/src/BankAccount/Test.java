package BankAccount;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws NegativeMoneyException, InvalidAccountException {
	Scanner input=new Scanner(System.in,"UTF-8");

	    System.out.println("Name:");
	    String nameP=input.nextLine();
	    System.out.println("ID:");
	    long id=input.nextLong();
	    System.out.println("Sum:");
	    double sumP=input.nextDouble();
	    input.nextLine();
	 
	
		PersonalAccount personalAccounts=new PersonalAccount(nameP,id,sumP);
		System.out.println(personalAccounts.getName());
		System.out.println(personalAccounts.getId());
	    System.out.println(personalAccounts.getSum_bank());
	   
		System.out.println();
		
		 System.out.println("Firm name:");
		    String nameFirm=input.nextLine();
		    System.out.println("Bulstat:");
		    String bulstat=input.nextLine();
		    System.out.println("Sum:");
		    double sumC=input.nextDouble();
		    
		CoorporativeAccount coorporativeAccount=new CoorporativeAccount(nameFirm,bulstat,sumC);
		System.out.println(coorporativeAccount.getName_firm());
		System.out.println(coorporativeAccount.getSum_bank());
		System.out.println(coorporativeAccount.getBulstat());
		
		
		TestClass test=new TestClass();  //doesn't inherite Account class
		//test.doPirnt();
		
		System.out.println();
        
	  
		Account.CheckAccount(personalAccounts);
		Account.CheckAccount(coorporativeAccount);
		//Account.CheckAccount(test);
		
	
	input.close();
	
	}
	
}