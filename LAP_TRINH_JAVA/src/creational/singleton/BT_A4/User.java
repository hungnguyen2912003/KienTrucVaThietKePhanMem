package creational.singleton.BT_A4;

public class User {
    String ten;

    public User(String ten) {
        this.ten = ten;
    }
    public void Vote(Candidate c){
        Election.getInstance().Vote(c);
    }
}
