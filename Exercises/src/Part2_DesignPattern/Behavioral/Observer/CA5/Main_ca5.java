package Part2_DesignPattern.Behavioral.Observer.CA5;

public class Main_ca5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 = new TaiKhoan("Hưng", 1000, atm);
        System.out.println("Lần 1: ");
        atm.rutTien(500);
        System.out.println("Lần 2: ");
        tk1.duaTheVaoATM();
        atm.rutTien(500);
        System.out.println("Lần 3: ");
        atm.rutTien(600);
    }
}

