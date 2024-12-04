package Part1_NNLTJava.js3;

public class SinhVienBiz extends SinhVienPoly{
    Double diemMarketing;
    Double diemSales;

    public SinhVienBiz(String hoTen, String nganh, Double diemMarketing, Double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
