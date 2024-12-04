package Part1_NNLTJava.js3;

public class SinhVienIT extends SinhVienPoly {
    Double diemJava;
    Double diemCss;
    Double diemHtml;

    public SinhVienIT(String hoTen, String nganh, Double diemJava, Double diemCss, Double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiem(){
        return (2*diemJava + diemHtml + diemCss)/4;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
