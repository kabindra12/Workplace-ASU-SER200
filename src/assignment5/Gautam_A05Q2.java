package assignment5;

/**
 * Program to write user input text on a file.
 * 
 * Completion time: 1 hr
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gautam_A05Q2 {
	public static void main(String[] args) throws IOException {
		String value;
		String file = "userStrings.txt";
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		do {
			value = scan.nextLine();
			if (!value.equals("DONE")) {
				outFile.print(value + "\r\n");
			}
		} while (!value.equals("DONE"));
		outFile.close();
		scan.close();
		System.out.println("Output file has been created: " + file);
	}
}