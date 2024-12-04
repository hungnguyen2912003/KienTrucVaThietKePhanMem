package Part2_DesignPattern.Creational.Builder_Pattern.a4;

public class Election {

    int trump = 0, biden = 0;
    public static Election instance;

    private Election() {
    }

    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }

    public void Vote(Candidate c){
        if(c == Candidate.TRUMP)
            trump++;
        else
            biden++;
    }

    public void InKQ(){
        System.out.println("TRUMP: " + trump);
        System.out.println("BIDEN: " + biden);
    }
}
