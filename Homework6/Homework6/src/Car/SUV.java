package Car;

public class SUV extends Car {
	private boolean off_road = false;

	public SUV(double price) {
		super(price);
		// checkCar();
	}

	public boolean isOff_road() {
		return off_road;
	}

	public void setOff_road(boolean off_road) {
		this.off_road = off_road;
	}

	/*
	 * public boolean checkCar(){ System.out.println(
	 * "Is this car is suitable for off-road"); System.out.println("Y/N");
	 * 
	 * char answer = 0; if(answer=='Y'){ return off_road;
	 * 
	 * }else return off_road=false;
	 */

}