package assignment2;

/**
 * A program that plays the Hi-Lo guessing game with numbers. The program would pick a random number 
 * between 1 and 100 (inclusive), then repeatedly prompt the user to guess the number. On each guess, 
 * report to the user that they are correct or that the guess is high or low. Continue accepting guesses
 *  until the user guesses correctly or chooses to quit. A user may choose to quit midgame by entering 0. 
 *  Count the number of guesses and report that value when the user guesses correctly. At the end of each
 *  game (by quitting or a correct guess), prompt to determine whether the user wants to play again. 
 *  Continue playing games until the user chooses to stop. 
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */

import java.util.Random;
import java.util.Scanner;

public class Gautam_A02Q5 {

	public static void main(String[] args) {
		char yesNo;
		Scanner scan = new Scanner(System.in);
		do {
			Random rand = new Random();
			int random, userInput = -1, noOfuserInput = 1;
			random = rand.nextInt(99) + 1;
			while (userInput != random && userInput != 0) {
				System.out.print("What number do you guess? ");
				userInput = scan.nextInt();
				if (userInput == 0) {
					System.out.println("Quitting game.");
				} else if (userInput < random) {
					System.out.println("That's too low");
					noOfuserInput++;
				} else if (userInput > random) {
					System.out.println("That's too high");
					noOfuserInput++;
				} else {
					System.out.println("That's correct. You made "
							+ noOfuserInput + " guesses.");
				}
			}
			System.out.println("Would you like to play again? ");
			yesNo = scan.next().charAt(0);
		} while (yesNo == 'Y');
		scan.close();
	}

}
