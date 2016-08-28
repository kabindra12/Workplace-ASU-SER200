package work;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What year should be checked? ");
		int year = scan.nextInt();
		if (year < 1582)
		{
			System.out.println("Please enter only years after 1582");
		}
		else if ((year%100==0 && year%400!=0))
		{
			
			System.out.println("This is not a leap year.");
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
