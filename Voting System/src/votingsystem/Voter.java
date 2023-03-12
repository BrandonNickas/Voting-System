/*
 * Course: COP 3530
 * Author: Brandon Nickas
 * Purpose: Create voter that can vote in the election.
*/
package votingsystem;

public class Voter extends Person { //Inherits the person class

	private int voterId;
	private boolean voted = false;
	
	//constructor for voter but send all the info up to the person class using the super keyword
	Voter(int voterId, int age, char gender, String firstName, String lastName, String politicalParty) {
		super(age, gender, firstName, lastName, politicalParty);
		this.voterId = voterId;
	}
	
	//shows the voter id
	public int getVoterId() {
		return voterId;
	}
	
	//makes sure the voter has not already voted
	public boolean hasVoted() {
		return voted;
	}
	
	//notes when the voter has voted
	public void voted() {
		voted = true;
	}
	
	//Get the full name of the voter by combining information gathered earlier
	public String getFullName() {
		return firstName + " " + lastName;
	}

}
