package assignment2;

/**
 * Pringing diamond pattern with 10 rows and 9 max character
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */

public class Gautam_A02Q6 {

	public static void main(String[] args) {

		final int CHAR_SIZE = 9;

		for (int i = 1; i <= CHAR_SIZE; i += 2) {
			for (int k = CHAR_SIZE; k >= i; k -= 2) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= CHAR_SIZE; i += 2) {
			for (int k = 1; k <= i; k += 2) {
				System.out.print(" ");
			}
			for (int j = CHAR_SIZE; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
