package behavioral.Observer.TiGia;

public class Main_TiGia {
    public static void main(String[] args) {
        TiGia t = new TiGiaUSD();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.dangKy();
        b.dangKy();
        System.out.println("Thông báo lần 1: ");
        t.notify(-1);
        a.huyDangKy();
        System.out.println("Thông báo lần 2: ");
        t.notify(3);
    }
}
