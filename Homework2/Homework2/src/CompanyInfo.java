import java.util.Scanner;

public class CompanyInfo {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Enter name:");
        String name=input.nextLine();
       
        System.out.println("Enter last name");
        String lname=input.nextLine();
        
        System.out.println("Enter age:");
        short age=input.nextShort();
        
        System.out.println("Enter gender(m/f):");
        char gender=input.next().charAt(0);
        
        System.out.println("Enter ID:");
        long id=input.nextLong();
        
        System.out.println("Telephone number:");
        int tnumber=input.nextInt();
        
        

        System.out.println("Name:"+name);
        System.out.println("Last name:"+lname);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("ID:"+id);
        System.out.println("Telephone nubmer:"+tnumber);
        
        
        input.close();
	}

}
