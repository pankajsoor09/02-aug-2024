package printpattern;

public class Pattern6 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 0; i < rows; i++) {
			// Print leading spaces
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print("  ");
			}
			// Print asterisks
			for (int j = 0; j <= i; j++) {
				System.out.print("  * ");
			}
			System.out.println();
		}

	}
}
/*output pattern
 
          * 
        *   * 
      *   *   * 
    *   *   *   * 
  *   *   *   *   * 


*/