package DesignPatterns;

public class Tablet  extends Device implements DeviceNew{

	public Tablet(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
	
	@Override
	 public void printInfo(){
		
	System.out.println("Tablet model:"+this.model);
  	 System.out.println("Tablet brand:"+this.brand);
	}

	@Override
	public void produce() {
		System.out.println("Inside Tablet::produce() method");
		printInfo();
	}
}
