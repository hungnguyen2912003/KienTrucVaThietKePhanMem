package creational.singleton.BT_A4;

public class MainVote {
    public static void main(String[] args) {
        User user1 = new User("Hưng");
        User user2 = new User("Hiệp");
        User user3 = new User("Đạt");
        User user4 = new User("Khoa");
        user1.Vote(Candidate.TRUMP);
        user2.Vote(Candidate.TRUMP);
        user3.Vote(Candidate.BIDEN);
        user4.Vote(Candidate.BIDEN);
        Election.getInstance().inKetQua();
    }
}
