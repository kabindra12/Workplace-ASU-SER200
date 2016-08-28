/**
 * This program reads user input hours, minutes and seconds in INT and convert those to total seconds.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.util.Scanner;

public class Gautam_A01Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hour = scan.nextInt();
		System.out.print("Enter minutes: ");
		int minute = scan.nextInt();
		System.out.print("Enter seconds: ");
		int second = scan.nextInt();
		int totalSeconds = (hour*60*60) + (minute*60) +second;   //Converting hours and minutes to seconds.
		System.out.println("The total seconds is "+totalSeconds);
		scan.close();
	}

}
