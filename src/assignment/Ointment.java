package assignment;

public class Ointment  extends Medicine{
	
	public Ointment(String name, String address) {
		super(name, address);
	}

	public void displayLabel () {
		super.displayLabel();
		System.out.println("Keep out from Children");

		
	}
}
