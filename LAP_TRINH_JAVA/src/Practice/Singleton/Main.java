package Practice.Singleton;


public class Main {
    public static void main(String[] args) {
        Users user1 = new Users("Hung");
        Users user2 = new Users("Minh");
        Users user3 = new Users("Tri");
        Users user4 = new Users("Dat");

        user1.Vote("Trump");
        user2.Vote("Biden");
        user3.Vote("Trump");
        user4.Vote("Biden");

        System.out.println(Election.getInstance().inKQ());
    }
}
