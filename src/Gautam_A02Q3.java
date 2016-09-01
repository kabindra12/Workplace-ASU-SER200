


/**
 * A program that computes and displays the result of rolling
 * several 6-sided dice and adding a number. Prompt the user for
 * the number of dice and the number to add.
 * 
 * Completion time: 40 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */

import java.util.Random;
import java.util.Scanner;

public class Gautam_A02Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many dice would you like to roll? ");
		int noOfDice = scan.nextInt();
		System.out.print("What should be added to the result? ");
		int tobeAdded = scan.nextInt();
		Random rand = new Random();
		int sum = 0;
		int random;
		for (int i=0; i<noOfDice; i++)
		{
			random =  rand.nextInt(5)+1;
			sum += random;
		}
		sum += tobeAdded;
		System.out.println("The result of rolling "+noOfDice+"D6"+"+"+tobeAdded+" is "+sum);
		scan.close();
	}
}
