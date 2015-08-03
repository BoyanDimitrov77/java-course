package BankAccount;

import java.lang.Exception;
public class InvalidAccountException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAccountException(String text){
		super(text);
	}
}
