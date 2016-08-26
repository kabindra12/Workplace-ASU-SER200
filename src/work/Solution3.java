package work;

import java.util.Random;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {

		//Question3
/*		"How many dice would you like to roll? "
		"What should be added to the result? "
		"The result of rolling "+x+"6d"+"+"+y+" is "+ans;*/
		
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
