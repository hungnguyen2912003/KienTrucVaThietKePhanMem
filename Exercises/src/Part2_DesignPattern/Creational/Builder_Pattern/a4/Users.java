package Part2_DesignPattern.Creational.Builder_Pattern.a4;

public class Users {
    String ten;

    public Users(String ten) {
        this.ten = ten;
    }

    public void Vote(Candidate c){
        Election.getInstance().Vote(c);
    }
}
