package DesignPatterns;

public class Phone  extends Device implements DeviceNew{


	public Phone(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
	@Override
	 public void printInfo(){
		
	System.out.println("Phone model:"+this.model);
  	 System.out.println("Phone brand:"+this.brand);
	}

	@Override
	public void produce() {
		System.out.println("Inside Phone::produce() method");
		printInfo();
	}
	
}
