package DesignPatterns;

public abstract class Device {
    
	protected String model;
     protected String brand;
     
     public String getModel() {
 		return model;
 	}

 	public void setModel(String model) {
 		this.model = model;
 	}

 	public String getBrand() {
 		return brand;
 	}

 	public void setBrand(String brand) {
 		this.brand = brand;
 	}

     
     public void printInfo(){
    	 System.out.println(this.model);
    	 System.out.println(this.brand);
     }
	
}
