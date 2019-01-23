package main.java.edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
		StringBuilder modified = new StringBuilder();
		if (input.length() > 2) {
			for (int i = 2; i < input.length(); i++) {
				modified.append(input.charAt(i));
			}
			modified.append(input.charAt(1));
			modified.append(input.charAt(0));
			return modified.toString();
		} else if (input.length() == 2) {
			modified.append(input.charAt(1));
			modified.append(input.charAt(0));
			return modified.toString();
		}
		return input;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
