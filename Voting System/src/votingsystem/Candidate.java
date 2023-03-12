/*
 * Course: COP 3530
 * Author: Brandon Nickas
 * Purpose: Make the candidates that the voters will vote on in the election
*/
package votingsystem;

public class Candidate extends Person {

	private int voteCount;
	
	//The constructor for a candidate. All of the values are passes up to the person class
	Candidate(int age, char gender, String firstName, String lastName, String politicalParty) {
		super(age, gender, firstName, lastName, politicalParty);
	}

	//Shows how many votes a candidate has.
	public int getVoteCount() {
		return voteCount;
	}
	
	//When a vote who has not voted yet chooses this candidate their number of votes goes up by one
	public void incrementVoteCount() {
		voteCount++;
	}
	
	//Combines information gathered earlier and prints it out in one line.
	public String getFullName() {
		if(politicalParty.equals("Democrat") || politicalParty.equals("Republican")) {
			return firstName + " " + lastName + " - " + politicalParty.substring(0,1);
		}
		else {
			return firstName + " " + lastName + " - NA";
		}
	}

}
