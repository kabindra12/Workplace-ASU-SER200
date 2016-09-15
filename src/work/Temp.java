package work;

import java.util.Scanner;

public class Temp {
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
		Temp.getUserInput();
		System.out.println("The average is " + Temp.getAverage(inputValue));
	}

}
