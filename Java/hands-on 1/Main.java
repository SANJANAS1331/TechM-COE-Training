public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("X");
        Candidate candidate2 = new Candidate("Y");
        Voter voter1 = new Voter("Z", "z@example.com");
        Vote vote1 = new Vote(voter1, candidate1);
        vote1.printVoteDetails();
    }
}
