package assignment;

import java.util.Random;

public class InstrumentTest {
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		Random random = new Random();
		int num = 0;

		for (int i = 0; i < 10; i++) {
			num = random.nextInt(3);
			num++;

			if (num == 1) {
				instruments[i] = new Piano();
			}

			else if (num == 2) {
				instruments[i] = new Flute();
			}

			else {
				instruments[i] = new Guitar();
			}

		}
		for (int i = 0; i < 10; i++) {
			instruments[i].play();
			System.out.println();
		}

		System.out.println("----------------------------------");

		for (int i = 0; i < instruments.length; i++) { // object instanceof ClassName
			if (instruments[i] instanceof Piano) {

				System.out.println("Instrument at index " + i + " is a Piano");

			} else if (instruments[i] instanceof Flute) {

				System.out.println("Instrument at index " + i + " is a Flute");

			} else if (instruments[i] instanceof Guitar) {

				System.out.println("Instrument at index " + i + " is a Guitar");
			}
			System.out.println();
		}
	}
}
