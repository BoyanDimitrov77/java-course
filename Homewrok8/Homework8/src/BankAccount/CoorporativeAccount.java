package BankAccount;

public class CoorporativeAccount  extends Account{
private String name_firm;
private String bulstat;
	

public CoorporativeAccount(String name_firm,String bulstat,double sum_bank) throws NegativeMoneyException{
	super(sum_bank);
	this.name_firm=name_firm;
	this.bulstat=bulstat;
	
}


public String getName_firm() {
	return name_firm;
}


public void setName_firm(String name_firm) {
	this.name_firm = name_firm;
}


public String getBulstat() {
	return bulstat;
}


public void setBulstat(String bulstat) {
	this.bulstat = bulstat;
}




}
