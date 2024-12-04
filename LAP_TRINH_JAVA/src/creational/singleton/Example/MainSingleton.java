package creational.singleton.Example;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.inCount();
        s1.inCount();
        s2.inCount();
        s1.inCount();
    }
}
