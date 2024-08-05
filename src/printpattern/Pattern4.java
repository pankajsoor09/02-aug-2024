package printpattern;

public class Pattern4 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 0; i < rows; i++) {// It controls the number of rows in the triangle

			for (int j = 0; j < i; j++) { // Print spaces

				System.out.print("  ");
			}
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}

/*output pattern
 
 * * * * *
   * * * *
     * * *
       * *
         *


First Iteration (i = 0):

Spaces: 0
Asterisks: 5
Output: * * * * *
Second Iteration (i = 1):

Spaces: 1
Asterisks: 4
Output: * * * *
Third Iteration (i = 2):

Spaces: 2
Asterisks: 3
Output: * * *
Fourth Iteration (i = 3):

Spaces: 3
Asterisks: 2
Output: * *
Fifth Iteration (i = 4):

Spaces: 4
Asterisks: 1
Output: *
*/