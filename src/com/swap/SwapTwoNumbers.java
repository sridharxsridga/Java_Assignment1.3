/* Write a program that swaps the values of two variables without using third variable.
 * 
 * Expected Output: Print the swapped values of both the variables.
 */

package com.swap;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int firstVariable = -10;
		int secondVariable = 20;
		System.out.println("Before Swapping  Value for 'firstVariable' is " + firstVariable
				+ " and for 'secondVariable' is " + secondVariable);
		firstVariable = firstVariable + secondVariable;
		secondVariable = firstVariable - secondVariable;
		firstVariable = firstVariable - secondVariable;
		System.out.println("After Swapping  Value for 'firstVariable' is " + firstVariable
				+ " and for 'secondVariable' is " + secondVariable);
	}

}
