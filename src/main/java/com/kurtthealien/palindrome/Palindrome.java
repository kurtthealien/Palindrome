package com.kurtthealien.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	// As we run through the string just once, the algorithm is O(n)
	public static boolean isPalindrome(String inputString) {
		
		int startIter = 0;
		int endIter = inputString.length() - 1;
		
		while (startIter < endIter) {
			if (Character.toLowerCase(inputString.charAt(startIter)) != Character.toLowerCase(inputString.charAt(endIter))) {
				return false;
			}
			startIter++;
			endIter--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Starting Palindrome checker...");
		
		 // Enter data using BufferReader
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		
        for(;;) {
        	System.out.println("Please, introduce the string to check:");
        	
        	try {
        		String word = inputReader.readLine();
            
        		Boolean result = isPalindrome(word);
            
        		System.out.println("  The word " + word + " is " + (result ? "" : "not ") + "a palindrome");
        	} catch (IOException ioEx) {
        		System.out.println("  There was an error retrieving the word, please try again: " + ioEx.getMessage());
        	}
        }
	}
}
