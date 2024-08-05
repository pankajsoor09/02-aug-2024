package assignment;

public class Syrup extends Medicine{
	
	public Syrup(String Dabur, String address) {
		super(Dabur, address);
	}

	public void displayLabel () {
		super.displayLabel();
		System.out.println("Shake well before use");

		
	}

}
