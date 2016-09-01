package work;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		List<Integer> userInput = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter a value to plot: ");
		DecimalFormat f1 = new DecimalFormat("##.00");
		while (scan.hasNextInt()) {
			num = scan.nextInt();
			if (num == 0) {
				break;
			} else if (num > 0 && num <= 10) {
				userInput.add(num);
				System.out.print("Enter a value to plot: ");
			} else if (num < 0 || num > 10) {
				System.out.println("Invalid input!");
				System.out.print("Enter a value to plot: ");
			}
		}
		System.out.println("The average is: " + f1.format(average(userInput)));
		System.out.println("The Standard Deviation is: " + f1.format(standardDeviation(userInput)));
		print(userInput);
		scan.close();
	}

	private static double average(List<Integer> userInput) {
		double sum = 0.0;
		for (int i = 0; i < userInput.size(); i++) {
			sum += userInput.get(i);
		}
		return (double) sum / userInput.size();
	}

	private static double standardDeviation(List<Integer> userInput) {
		double average = average(userInput);
		double stdSum = 0.0;
		for (int i = 0; i < userInput.size(); i++) {
			stdSum += Math.pow((userInput.get(i) - average), 2);
		}
		double standardDev = Math.sqrt((stdSum / userInput.size()));
		return standardDev;

	}

	private static void print(List<Integer> userInput)
	{
		String hash = "#";
			
			for (int i=0;i<10;i++)
			{
				int count = 0;
			for(int contain : userInput)
			{	
			if (contain == i+1)
			{
				count++;
			}
			}
			System.out.println(i+1 +" | " + hash);
		}
	}

}
