/*
 * Course: COP 3530
 * Author: Brandon Nickas
 * Purpose: Show off that all of the previous classes along with their methods work.
*/
package votingsystem;

public class Election {
	
	public static void main(String arg[]) {
		//Making objects from the candidates class for the voters to vote on
		Candidate MM = new Candidate(23, 'M', "Mickey", "Mouse", "Democrat");
		Candidate DD = new Candidate(26, 'M', "Donald", "Duck", "Republican");
		Candidate Minni = new Candidate(29, 'F', "Minnie", "Mouse", "Non-Affiliant");
		
		//Creating the array the voting machine class will use to be able to call the functions properly.
		Candidate partyGoers[] = {MM, DD, Minni};
		
		//Making an object of the voting machice class
		VotingMachine voteTaker = new VotingMachine(partyGoers);
		
		//Making objects from the voter class to be able to vote in the election
		Voter AL  = new Voter(1, 34, 'M', "Alfredo", "Linguini", "Democrat");
		Voter AD  = new Voter(2, 18, 'M', "Andy", "Davis", "Democrat");
		Voter CF  = new Voter(3, 74, 'M', "Carl", "Fredricksen", "Republican");
		Voter CP  = new Voter(4, 12, 'F', "Chip", "Potts", "Non-Affiliant");
		Voter CT  = new Voter(5, 24, 'F', "Cinderella", "Tremaine", "Republican");
		Voter CD  = new Voter(6, 43, 'F', "Cruella", "de Vil", "Republican");
		Voter LS  = new Voter(7, 27, 'M', "Li", "Shang", "Non-Affiliant");
		Voter FR  = new Voter(8, 26, 'M', "Flynn", "Rider", "Non-Affiliant");
		Voter JS  = new Voter(9, 200, 'M', "Jack", "Skeleton", "Democrat");
		Voter JaS  = new Voter(10, 38, 'M', "James", "Sulivan", "Republican");
		Voter JP  = new Voter(11, 23, 'F', "James", "Porter", "Democrat");
	
		//The voters are all voting using the method from the voting machine class
		voteTaker.vote(AL, MM);	
		voteTaker.vote(AD, MM);	
		voteTaker.vote(CF, DD);	
		voteTaker.vote(CP, Minni);	
		voteTaker.vote(CT, DD);	
		voteTaker.vote(CD, DD);	
		voteTaker.vote(LS, Minni);	
		voteTaker.vote(FR, Minni);	
		voteTaker.vote(JS, DD);	
		voteTaker.vote(JaS, DD);
		voteTaker.vote(JP, MM);	
		
		//This show the results of the vote
		voteTaker.tally();
	}
}
