package User;

import java.util.regex.Pattern;

public class User {

	 String email;
     String password;
	
	public User(String email,String password){
		this.email=email;
		this.password=password;
		
		setEmail(email);
		setPassword(password);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
		String character="@";
		String character1=".";
		int length=email.length();
		
		if(length>5 && Pattern.compile(character).matcher(email).find() && Pattern.compile(character1).matcher(email).find()){
		
			System.out.println(email);
			
		}else{
			throw new IllegalArgumentException("Not real email.");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		String number="[0-9]+";
		
		int lenght=password.length();
	
		if(lenght>=6 && Pattern.compile(number).matcher(password).find()){
			
			System.out.println(password);
			
		}else{
			
			throw new IllegalArgumentException("Password has less letters or doesn't consist at least a number");
		}
		
		

		
		
	}		
			
		
	
}
