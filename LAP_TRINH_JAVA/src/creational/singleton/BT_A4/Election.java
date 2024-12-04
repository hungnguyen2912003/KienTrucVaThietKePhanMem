package creational.singleton.BT_A4;

public class Election {
    //Khai báo biến instance
    private static Election instance;

    int trump = 0, biden = 0;

    //Phương thức khởi tạo
    public Election() {
    }

    //Phương thức getInstance để trả về biến instance
    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }

    public void Vote(Candidate c){
        if(c == Candidate.BIDEN)
            biden++;
        else if(c == Candidate.TRUMP)
            trump++;
    }

    public void inKetQua(){
        System.out.println("Donal Trump: " + trump);
        System.out.println("Joe Biden: " + biden);
    }
}
