public class Vote {
    private Voter voter;
    private Candidate candidate;

    public Vote(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
        candidate.addVote();
    }

    public void printVoteDetails() {
        System.out.println("Vote Details:");
        System.out.println("Voter Name: " + voter.getVoterName());
        System.out.println("Voter Email: " + voter.getEmail());
        System.out.println("Voted For: " + candidate.getCandidateName());
        System.out.println("Total Votes for " + candidate.getCandidateName() + ": " + candidate.getVoteCount());
    }
}