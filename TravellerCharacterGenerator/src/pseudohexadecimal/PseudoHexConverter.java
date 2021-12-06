package pseudohexadecimal;

/**
 * Classic Traveller uses a "pseudo-hexadecimal" notation for numbers. This class will be 
 * used to convert from and to the notation. 
 * 
 * Any number to be converted to pseudo-hexadecimal is assumed to be an integer from 1-35
 * inclusive.
 * 
 * Any number to be converted from pseudo-hexadecimal is assumed to be a character representing either
 * a digit 1-9 inclusive. or a capital letter A-Z inclusive.
 * 
 * Numbers in the pseudo-hexadecimal representation 1-9 inclusive are represented by the arabic
 * numerals 1-9.  * Anything over 9 is represented by a capital letter, starting with A and continuing 
 * through the alphabet to Z. It ends at 35/Z.
 * 
 * @author Jesse Woods
 *
 */
public class PseudoHexConverter {

	/**
	 * Converts an integer 1-35 to a pseudo-hexadecimal equivalent.
	 * @param toConvert an integer 1-35 inclusive.
	 * @return a pseudo-hexadecimal representation of the input number.
	 */
	public static char toPseudoHex(int toConvert) {
		//TODO
	}
	
	/**
	 * Converts a character representation of a pseudo-hexadecimal to an integer.
	 * @param toConvert 
	 * @return
	 */
	public static int fromPseudoHex(char toConvert) {
		//TODO
	}
}
