/*
 * Course: COP 3530
 * Author: Brandon Nickas
 * Purpose: This is made to make the template where candidates and voters will come from. 
*/
package votingsystem;

public abstract class Person {
	
	private int age;
	private char gender;
	protected String firstName;
	protected String lastName;
	protected String politicalParty;
	
	//This is the constructor for person which is abstract and therefore is going to be forced to used when making a candidate or voter
	Person(int age, char gender, String firstName, String lastName, String politicalParty){
		this.age = age;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.politicalParty = politicalParty;	
	}
	
	//Retrieves the age of the voter/Candidate.
	public int getAge() {
		return age;
	}

	//Retrieves the gender of the voter/Candidate.
	public char getGender() {
		return gender;
	}

	//Tells classes that inherent the person class that they have to have some sort of getFullName() method.
	public abstract String getFullName();
}
