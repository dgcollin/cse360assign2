/**
 * @author - Daniel Collins
 * Class ID: 351
 * Assignment #2
 * Description: This class performs various mathematical operations on an integer entered by the user and can also return the 
 * 				history of said operations.
 */
package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Initializes the calculator.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	/**
	 * Returns the current total.
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Adds a user entered value to the total and updates the history accordingly.
	 * 
	 * @param value the number that will be added to the total.
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	/**
	 * Subtracts a user entered value from the total and updates the history accordingly.
	 * 
	 * @param value the number that will be subtracted from the total.
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	/**
	 * Multiplies the total by a user entered value and updates the history accordingly.
	 * 
	 * @param value the number that will be multiplied by the total.
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	/**
	 * Divides the total by a user entered value and updates the history accordingly.
	 * 
	 * @param value the number that the total will be divided by.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		history = history + " / " + value;
	}
	/**
	 * Returns the history of all actions performed by the Calculator.
	 */
	public String getHistory () {
		return history;
	}
}
