public class Candidate {
    private String candidateName;
    private int voteCount;

    public Candidate(String candidateName) {
        this.candidateName = candidateName;
        this.voteCount = 0;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void addVote() {
        this.voteCount++;
    }
}
