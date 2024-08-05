package assignment;

public class Tablet extends Medicine {
	
	public Tablet(String name, String address) {
		super(name, address);
	}

	public void displayLabel() {
		super.displayLabel();
		System.out.println("Store in a cool dry place");

	}

}
