package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
double nickels = Integer.parseInt(answer);
nickels = (0.05*nickels);
		// Ask the user how many dimes they have, and convert their answer
answer = JOptionPane.showInputDialog("How many dimes do you have?");
double dimes = Integer.parseInt(answer);
dimes = (0.10*dimes);
		// Ask the user how many quarters they have, and convert their answer
answer = JOptionPane.showInputDialog("how many quarters do you have?");
double quarters = Integer.parseInt(answer);
quarters= (0.25*quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
double total = (nickels + dimes + quarters);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "$" + total);
	}
}

