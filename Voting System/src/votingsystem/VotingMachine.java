/*
 * Course: COP 3530
 * Author: Brandon Nickas
 * Purpose: Makes the rules and abillity for voting
*/
package votingsystem;

public class VotingMachine {
	public Candidate[] candidates; //Makes and array of all of the candidates in the poll
	
	//Constructor for the voting machine class and only includes the array of candidates.
	VotingMachine(Candidate candidates[]){
		this.candidates = candidates;
	}
	
	//This lets the votes vote by checking if they have voted for then add a vote to the candidate of thier choice
	public void vote(Voter v, Candidate c) {
		if(!v.hasVoted()) {
			v.voted();
			c.incrementVoteCount();
		}
	}
	
	//Show the standing of the poll
	public void tally() {
		//This just list the candidates with how many voters there are
		for(int i = 0; i < candidates.length; i++) {
			System.out.println(candidates[i].getFullName() + " has " + candidates[i].getVoteCount() + " votes." );
		}
		
		//This for loop looks for which candidate has the most votes and marks them
		Candidate mostVotes = candidates[0];
		for(int i = 0; i < candidates.length; i++) {
			if(candidates[i].getVoteCount() > mostVotes.getVoteCount()) {
				mostVotes = candidates[i];
			}	
		}
		
		//This prints the winner of the poll
		System.out.println(mostVotes.getFullName() + " won with " + mostVotes.getVoteCount() + " votes.");
	}
}

