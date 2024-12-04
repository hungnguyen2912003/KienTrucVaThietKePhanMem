package Practice.Singleton;

import creational.singleton.BT_A4.User;

import java.util.Objects;

public class Election {

    private int trump = 0;
    private int biden = 0;
    private static Election instance;

    public Election(){}

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    public void Vote(String vote){
        if(vote.equals("Trump")){
            trump++;
        }
        else if(vote.equals("Biden")){
            biden++;
        }
    }

    public String inKQ(){
        StringBuilder builder = new StringBuilder();
        builder.append("Trump: ").append(trump).append("\n")
                .append("Biden: ").append(biden);
        return builder.toString();
    }
}
