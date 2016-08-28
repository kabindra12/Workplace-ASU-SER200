package assignment2;

/**
 * An application that reads the semiperimeter and sides of a triangle 
 * from the user, and prints its area.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Gautam_A02Q2 {
	
	public static void main(String[] args) {
		float s,a,b,c,area;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is s? ");
		s = scan.nextFloat();
		System.out.print("What is a? ");
		a = scan.nextFloat();
		System.out.print("What is b? ");
		b = scan.nextFloat();
		System.out.print("What is c? ");
		c = scan.nextFloat();
		area = (float) Math.sqrt( (s*(s-a)*(s-b)*(s-c)));
		DecimalFormat dfm1 = new DecimalFormat("0.###");		
		System.out.println("The area is "+dfm1.format(area));	
		scan.close();
	}

}
