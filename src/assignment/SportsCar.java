package assignment;

public class SportsCar extends Car {

	private int airBallonNo;

	public SportsCar(int airBallonNo) {
		super();
		this.airBallonNo = airBallonNo;
	}

	public void display() {
		super.display();
		System.out.println("No of airBallon : " + airBallonNo);

	}

	public static void main(String[] args) {
		Car car = new Car();
		car.drive(202, 5);
		car.display();
		
		System.out.println("--------------------");
		
		SportsCar sportcar = new SportsCar(10);
		sportcar.drive(302, 5);
		sportcar.display();


	}

}
