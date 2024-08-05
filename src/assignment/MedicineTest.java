package assignment;

import java.util.Random;

public class MedicineTest {
	public static void main(String[] args) {

		Medicine[] drug = new Medicine[10];
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int num = random.nextInt(3)+1 ;

			if (num == 1) {
				drug[i] = new Syrup("Dabur", "Mumabai");
			} else if (num == 2) {
				drug[i] = new Tablet("Disprin", "Pune");
			} else if (num == 3) {
				drug[i] = new Ointment("Cipla", "Nagpur");
			}

		}
		for (int i = 0; i < 10; i++) {
			drug[i].displayLabel();
			System.out.println();
		}

	}

}
