package Practice.Singleton;

public class Users {

    String ten;

    public Users(String ten) {
        this.ten = ten;
    }

    public void Vote(String str){
        Election.getInstance().Vote(str);
    }
}
