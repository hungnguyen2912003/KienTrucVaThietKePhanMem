package creational.singleton.Example;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    int count = 0;
    public void inCount(){
        System.out.println(++count);
    }
}
