package BankAccount;

public class PersonalAccount extends Account{
	private String name;
	private long id;
	
	public PersonalAccount(String name,long id,double sum_bank) throws NegativeMoneyException{
		super(sum_bank);
		this.name=name;
		this.id=id;
		
		setName(name);
		setId(id);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	


}
