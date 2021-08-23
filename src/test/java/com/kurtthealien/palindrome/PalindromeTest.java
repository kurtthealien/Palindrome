package com.kurtthealien.palindrome;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.kurtthealien.palindrome.Palindrome;

@RunWith(Parameterized.class)
public class PalindromeTest {
	
	String stringToTest;
	Boolean expectedResult;
	
	public PalindromeTest(String stringToTest, Boolean result) {
		this.stringToTest = stringToTest;
		this.expectedResult = result;
	}

	@Parameterized.Parameters
	public static Collection<?> testCases() {
		return Arrays.asList(new Object[][] {
			{"ASA", true},
			{"ASa", true},
			{"asA", true},
			{"FOSCA", false},
			{"Repaper", true},
			{"RePapEr", true},
			{"14567", false},
			{"10,1", false},
			{"TIC TAC", false},
			{"TIC CIT", true},
			{"TIC1 CIT", false},
			{"1003001", true}
		});
	}
	
	@Test
	public void testPalindrome() {
		System.out.println("Testing Palindrome algorithm with string: " + stringToTest);
		
		Boolean result = Palindrome.isPalindrome(stringToTest);
		
		System.out.println("Expecting " + expectedResult + ", retrieved " + result);
		assertEquals(expectedResult, result);
	}
}
