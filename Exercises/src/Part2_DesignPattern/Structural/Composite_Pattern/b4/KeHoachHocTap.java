package Part2_DesignPattern.Structural.Composite_Pattern.b4;

public abstract class KeHoachHocTap {

    String ten;

    String p = "";

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    abstract int soTC();

    abstract double hocPhi();

    abstract String thongTin();


    abstract KeHoachHocTap add(KeHoachHocTap kh);

    abstract void remove(KeHoachHocTap kh);
}
