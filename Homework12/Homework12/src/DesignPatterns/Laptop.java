package DesignPatterns;

public class Laptop extends Device implements DeviceNew{

	public Laptop(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
	
	@Override
	 public void printInfo(){
		
	System.out.println("Laptop model:"+this.model);
   	 System.out.println("Laptop brand:"+this.brand);
	}

	@Override
	public void produce() {
		System.out.println("Inside Laptop::produce() method");
		printInfo();
		
	}
	
}