package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc1;

public class Main_cc1 {
    public static void main(String[] args) {
        context c = new context();
        System.out.println(c.setTinhToan(new Cong()).tinh(3, 5));
        System.out.println(c.setTinhToan(new Tru()).tinh(10, 5));
        System.out.println(c.setTinhToan(new Nhan()).tinh(8, 6));
        System.out.println(c.setTinhToan(new Chia()).tinh(15, 0));
    }
}
