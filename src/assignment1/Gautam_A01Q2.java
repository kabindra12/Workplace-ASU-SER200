package assignment1;

/**
 * Program to find out if a user input value is even or odd.
 * 
 * Completion time: 30 min
 * 
 * @author Kiran Gautam
 * @version 1.0
 */


import java.util.Scanner;
public class Gautam_A01Q2 {

	    public static final int NUM = 2;   	//1. NUM should be assigned as 2 to check even or odd.
	    
	    public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);       
		    int input, result;
	        
		    System.out.print("Enter an integer number: ");
	        input = scan.nextInt();      	//2. You can not assign string to int. 
	        							 	//Here, scan.nextLine() gets string but is trying to assign that string to "input" which is int.
		
		    result = input % NUM;    		//3. To end an statement, ";" is needed which was missing.

		    if (result == 0) {				//4. We are trying to check for boolean not assigning a value in if condition. so "==" instead of "=".
			    System.out.println("\n\nNumber " + input + " is even.");
		    }
		    else if (result != 0) {			//5. Logic was mistake. I changed ("even" to "odd") and ("odd" to "even") for the output string.
		   	    System.out.println("\n\nNumber " + input + " is odd.");
		    }
	    }    
	}
	

