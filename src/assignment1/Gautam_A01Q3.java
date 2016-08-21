package assignment1;


/**
 * Program to convert Fahrenheit to Kelvin by reading the Fahrenheit temperature from the user.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.util.Scanner;

public class Gautam_A01Q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a temperature in Fahrenheit: ");
		double fahrenheitTemp = scan.nextDouble(); 				 //User input Fahrenheit value
		final double BASE = 459.67;
		final double CONVERSION_FACTOR = 5.0 / 9.0;
		double kelvinTemp;
		kelvinTemp =(fahrenheitTemp + BASE)*CONVERSION_FACTOR;   // Equation: T(K) = (T(°F) + 459.67)× 5/9
		System.out.println("Kelvin Temperature: " + kelvinTemp);
	}

}
