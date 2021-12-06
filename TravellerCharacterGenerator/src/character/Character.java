package character;

import java.util.List;
import java.util.Set;

/**
 * This is a character in the Classic Traveller system. It will need to hold and return 
 * the following information: name, attributes, skills, age, possessions, terms, and former 
 * career with rank. 
 * 
 * @author Jesse Woods
 *
 */

public class Character {

	/**
	 * Stores name of career, rank, and terms served by the character in their career.
	 */
	private EmploymentHistory history;
	
	/**
	 * Stores the name of the character.
	 */
	String name;
	
	/**
	 * Stores the attributes as integers from 1-15 inclusive in the following order:
	 * Strength (STR), Dexterity (DEX), Endurance(END), Intelligence(INT), 
	 * Education(EDU), Social(SOC).
	 */
	private Statline attributes;
	
	/**
	 * Stores the age of the character in years.
	 */
	private int age;
	
	/**
	 * Stores the terms (four year periods) the character was in their career.
	 * Stored as a double because half terms can happen under the optional survival rules.
	 */
	private double terms;

	/**
	 * Stores skills and their rating. 
	 */
	private Skills skills;
	
	/**
	 * Stores possessions.
	 */
	private Posessions posessions;
	
	/**
	 * Constructor that takes all fields. 
	 * @param career career that the character previoulsy held.
	 * @param rank rank that the character had in their career.
	 * @param name name of the character.
	 * @param attributes character attributes.
	 * @param age age of the character in years.
	 * @param terms number of terms the character had in their prior career.
	 * @param skills the character's skills.
	 * @param posessions possession of the character.
	 */
	public Character(
			EmploymentHistory history, 
			String name, 
			Statline attributes, 
			int age, 
			Skills skills, 
			Posessions posessions) {
		this.history = history;
		this.name = name;
		this.attributes = attributes;
		this.age = age;
		this.skills = skills;
		this.posessions = posessions;
	}
	
	/**
	 * Gives a string representation of the character in the following format:
	 * [Career] [Rank] [Name (with noble title)] [attributes] Age [age]
	 * [terms] terms Cr[credits]
	 * [skills listed]
	 * [possessions other than credits listed]
	 */
	public String toString() {
		//TODO
	}
	
}
