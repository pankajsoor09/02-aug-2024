package assignment;

public class Car {

	private int speed;
	private int noOfGear;

	/*
	 * public Car(int speed, int noOfGear)
	 *  { super();
	 *   this.speed = speed;
	 * this.noOfGear = noOfGear; }
	 */

	public void drive(int speed,int noOfGear) {
		this.speed = speed;
		this.noOfGear = noOfGear;
	}

	public void display() {
		System.out.println("Car Details");
		System.out.println("Speed: " + speed);
		System.out.println("Number of Gears: " + noOfGear);
	}
	 

}
