package data_flow;

import java.util.Scanner;

/**
 * Palindrome class to determine whether or not a string is Palindrome
 * 
 * @author Kevin Ma, Rich Chau, Ryan Ly
 *
 */
public class Palindrome {
	/*
	 * This method checks if a string is Palindrome
	 * @param input takes in string input
	 */
	public static boolean isPalindrome(String input) {
		String reverseStr ="";
		Boolean isBoolean = false;
		
		// Loop through string input in reverse and add to string
		for (int i = input.length() - 1; i >= 0; i--) {
			reverseStr += input.charAt(i);
		}
		// Convert all strings to lower case and remove all spaces
		if (reverseStr.equals(input)) {
			
			isBoolean = true;
		}
		return isBoolean;
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean exit = false;
	
		do {
			System.out.print("Please enter a phrase to determine if it is Palindrome: ");
			// Needs refactoring
			if (in.hasNextInt() || in.hasNextDouble() || in.hasNextFloat()) {
				System.out.println("Please enter a valid String");
				in.nextLine();
				System.out.println();
				System.out.print("Please enter a phrase to determine if it is Palindrome: ");
			}

			String input = in.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9_-]", "");
			// Check if input is Palindrome
			if (isPalindrome(input) == true) {
				System.out.println("\"" + input + "\" has a length " + input.length() + " and is a Palindrome. " + isPalindrome(input));
				System.out.println();
			} else {
				System.out.println("\"" + input + "\"" + " has a length " + input.length() + " and is not a Palindrome. " + isPalindrome(input));
				System.out.println();
			}
		} while (!exit);
		in.close();
	}
}
