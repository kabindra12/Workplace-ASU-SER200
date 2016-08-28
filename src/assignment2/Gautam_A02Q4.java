package assignment2;


/**
 * Program to determine if a user input date is a leap year or not.
 * 
 * Completion time: 40 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.util.Scanner;

public class Gautam_A02Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What year should be checked? ");
		int year = scan.nextInt();
		if (year < 1582)
		{
			System.out.println("Please enter only years after 1582");
		}
		else if ((year%400==0) || ((year%4==0) && (year%100!=0)))
		{
			System.out.println("This is a leap year.");
		}
		else 
		{
			System.out.println("This is not a leap year.");
		}
		scan.close();
		
	}
}

