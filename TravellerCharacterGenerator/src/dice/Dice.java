package dice;

import java.util.Random;

/**
 * This class will be used to simulate dice throws. Classic Traveller exclusively uses
 * six-sided dice, so this will only be generating rolls of six-side dice, in different 
 * amounts.
 *  
 * @author Jesse Woods
 *
 */

public class Dice {
	
	/**
	 * A single die, generates a number from 1-6 inclusive.
	 */
	private Random die;

	/**
	 * Constructor that initializes the dice.
	 */
	public Dice() {
		die = new Random();
	}
	
	/**
	 * Rolls a number of six-sided dice and totals the rolled value.
	 * @param number the number of dice to be rolled, must be at least 0.
	 * @return the total of the rolled dice.
	 */
	public int roll(int number) {
		if(number < 0) { //Make sure we have a nonnegative number of dice.
			throw new IllegalArgumentException("Cannot throw negative dice.");
		}
		int total = 0;
		for(int i = 0; i < number; i++) { //Roll the bones
			total += die.nextInt(6) + 1; //Range of 1-6 inclusive
		}
		return total;
	}
	
}
