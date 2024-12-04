package Part2_DesignPattern.Creational.Builder_Pattern.a4;

public class Main_a4 {
    public static void main(String[] args) {
        Users user1 = new Users("Hưng");
        Users users2 = new Users("Quang");
        Users users3 = new Users("Minh");
        Users users4 = new Users("Minh");
        user1.Vote(Candidate.TRUMP);
        users2.Vote(Candidate.BIDEN);
        users3.Vote(Candidate.TRUMP);
        users4.Vote(Candidate.BIDEN);
        Election.getInstance().InKQ();
    }
}
