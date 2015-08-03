package BankAccount;

import java.lang.Exception;
@SuppressWarnings("serial")
public class NegativeMoneyException extends Exception {
	//private static final long serialVersionUID = 1L;

	public NegativeMoneyException(String text){
		super(text);
	}
}
