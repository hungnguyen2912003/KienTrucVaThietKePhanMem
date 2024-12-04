package Part1_NNLTJava.js4;

public class XeNgoaiThanh extends ChuyenXe{
    String NoiDen;
    int SoNgayDi;

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String noiDen) {
        NoiDen = noiDen;
    }

    public int getSoNgayDi() {
        return SoNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        SoNgayDi = soNgayDi;
    }

    public XeNgoaiThanh(String masochuyen, String hoTen, String soXe, float doanhThu, String noiDen, int soNgayDi) {
        super(masochuyen, hoTen, soXe, doanhThu);
        NoiDen = noiDen;
        SoNgayDi = soNgayDi;
    }
    @Override
    public String Xuat() {
        String st = super.Xuat();
        st = st + "Nơi đến: " + NoiDen + "\n" +
                "Số ngày đi: " + SoNgayDi + "\n";
        return st;
    }
}
