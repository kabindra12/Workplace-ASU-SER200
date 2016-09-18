package assignment5;

/**
 * Program to get the average of 5 user input doubles.
 * 
 * Completion time: 1 hr
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.util.Scanner;
//this is just testin
public class Gautam_A05Q1 {
	private static double[] inputValue = new double[5];

	private static double getAverage(double[] number) {
		double sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum / number.length;
	}

	private static void getUserInput() {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.print("Please enter a number: ");
				inputValue[count] = Double.parseDouble(scan.next());
				count++;
			} catch (Exception NumberFormatException) {
				System.out.println("Please enter a valid number.");
			}

		} while (count < inputValue.length);
		scan.close();
	}

	public static void main(String[] args) {
		Gautam_A05Q1.getUserInput();
		System.out.println("The average is " + Gautam_A05Q1.getAverage(inputValue));
	}

}
