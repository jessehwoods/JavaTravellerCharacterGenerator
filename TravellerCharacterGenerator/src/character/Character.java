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
	 * Holds the name of the career the character held.
	 */
	String career;

	/**
	 * Stores rank the character achieved in their career.
	 */
	private Rank rank;
	
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
	private Set<Skill> skills;
	
	/**
	 * Stores the credits posessed by the character.
	 */
	private int credits;
	
	/**
	 * Stores possessions.
	 */
	private List<Possession> posessions;
	
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
	public Character(String career, 
			Rank rank, 
			String name, 
			Statline attributes, 
			int age, 
			double terms, 
			Set<Skill> skills, 
			int credits,
			List<Possession> posessions) {
		//TODO: finish constructor
	}
	
	/**
	 * Gives the full string representation of the character in the following format:
	 * [Career] [Rank] [Name (with noble title)] [attributes] Age [age]
	 * [terms] terms Cr[credits]
	 * [skills]
	 * [possessions]
	 */
	public String toString() {
		//TODO
	}
	
}
