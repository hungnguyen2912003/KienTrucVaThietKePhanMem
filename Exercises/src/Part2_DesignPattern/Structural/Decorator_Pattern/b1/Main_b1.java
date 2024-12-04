package Part2_DesignPattern.Structural.Decorator_Pattern.b1;

public class Main_b1 {
    public static void main(String[] args) {
        BieuThuc bieuThuc1 = new BieuThucDonGian(6);
        bieuThuc1 = new Cong(bieuThuc1, 9);
        bieuThuc1 = new Nhan(bieuThuc1, 8);
        bieuThuc1 = new Cong(bieuThuc1, 5);
        bieuThuc1 = new Tru(bieuThuc1, 500);
        bieuThuc1 = new abs(bieuThuc1);
        System.out.println(bieuThuc1.bieuThuc() + " = " + bieuThuc1.giaTri());
    }
}
