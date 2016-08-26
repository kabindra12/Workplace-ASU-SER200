package assignment2;

import java.util.Scanner;

/**
 * Program to compute and display the distance between two points in a plane.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


public class Gautam_A02Q1 {
	
	public static void main(String[] args) {
		float x1,y1,x2,y2,distance;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is x1? ");
		x1 = scan.nextFloat();
		System.out.print("What is y1? ");
		y1 = scan.nextFloat();
		System.out.print("What is x2? ");
		x2 = scan.nextFloat();
		System.out.print("What is y2? ");
		y2 = scan.nextFloat();
		distance =  (float) Math.sqrt((float)(Math.pow((x2-x1),2) +(float) Math.pow((y2-y1), 2)));
		System.out.println("The distance is "+distance);		
	}

}
