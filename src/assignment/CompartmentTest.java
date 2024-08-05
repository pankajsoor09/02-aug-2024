package assignment;

import java.util.Random;

public class CompartmentTest {

	public static void main(String[] args) {
		Compartment compartments[] = new Compartment[10];

		Random random = new Random();

		int num = 0;

		for (int i = 0; i < 10; i++) {
			num = random.nextInt(4);

			if (num == 1) {
				compartments[i] = new FirstClass();
			} else if (num == 2) {
				compartments[i] = new Ladies();
			} else if (num == 3) {
				compartments[i] = new General();
			} else {
				compartments[i] = new Luggage();
			}
		}
		for (int i = 0; i < 10; i++) {
			compartments[i].notice();
			System.out.println();
		}

	}

}
