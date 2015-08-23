package DesignPatterns;

public class Test {

	public static void main(String[] args) {
		DeviceFactory deviceF=DeviceFactory.getInstance();
		
		DeviceNew device1=deviceF.getDeviceNew("Laptop");
		device1.produce();
		
		System.out.println();
		DeviceNew device2=deviceF.getDeviceNew("Phone");
		device2.produce();
		System.out.println();
		
		DeviceNew device3=deviceF.getDeviceNew("Tablet");
		device3.produce();

	}

}
