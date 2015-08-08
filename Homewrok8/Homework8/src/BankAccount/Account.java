package BankAccount;



public  class  Account {

	protected double sum_bank;

	

	public Account(double sum_bank) throws NegativeMoneyException{
		this.sum_bank=sum_bank;
		
		setSum_bank(sum_bank);
		
	}
	
	public double getSum_bank() {
		return sum_bank;
	}

	public void setSum_bank(double sum_bank) throws NegativeMoneyException{
		this.sum_bank = sum_bank;
		
		if(sum_bank>0){
			
		}else{
			throw new NegativeMoneyException("Sum cannot be negative");
		}
	}

	
public static void CheckAccount(Object object) throws InvalidAccountException{
		
		if(object instanceof PersonalAccount){
			System.out.println("PersonalAccount");
			System.out.println("ID:"+((PersonalAccount) object).getId());
		}else if(object instanceof CoorporativeAccount)
		{
			System.out.println("CoorporativeAccount");
			System.out.println("Bulstat:"+((CoorporativeAccount) object).getBulstat());
			
			
		}else{
			throw new InvalidAccountException("This object doens't inherite this class");
		}
		
		
			
		
	}

		
		
	}

