package Part1_NNLTJava.js4;

public class XeNoiThanh extends ChuyenXe{

    int SoTuyen, SoKM;

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        SoTuyen = soTuyen;
    }

    public int getSoKM() {
        return SoKM;
    }

    public void setSoKM(int soKM) {
        SoKM = soKM;
    }

    public XeNoiThanh(String masochuyen, String hoTen, String soXe, float doanhThu, int soTuyen, int soKM) {
        super(masochuyen, hoTen, soXe, doanhThu);
        SoTuyen = soTuyen;
        SoKM = soKM;
    }

    @Override
    public String Xuat() {
        String st = super.Xuat();
        st = st + "Số tuyến: " + SoTuyen + "\n" +
                "Số km: " + SoKM + "\n";
        return st;
    }
}
