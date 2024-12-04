package Part2_DesignPattern.Creational.Builder_Pattern.a2;

public class Main_a2 {
    public static void main(String[] args) {
        MyStringBuilder mystr = new MyStringBuilder()
                .addString("Hưng")
                .addFloat(2003)
                .addBool(false);
        System.out.println(mystr.toString());
    }
}
