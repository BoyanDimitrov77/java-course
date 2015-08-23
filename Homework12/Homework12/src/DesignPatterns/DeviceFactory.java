package DesignPatterns;

public class DeviceFactory {
	
	//Singleton
	private static DeviceFactory instance=new DeviceFactory();
	
    public static DeviceFactory getInstance() {
		return instance;
	}

	
	private DeviceFactory(){
		
	}
	
	public DeviceNew getDeviceNew(String device){
		
		if(device==null){
			return null;
		}
		
		if(device.equalsIgnoreCase("LAPTOP")){
			return new Laptop("X","Asus");
		}else if(device.equalsIgnoreCase("PHONE")){
			return new Phone("S6","Samsung");
		}else if(device.equalsIgnoreCase("TABLET")){
			return new Tablet("Yoga","Lenovo");
		}
		return null;
	}

}
