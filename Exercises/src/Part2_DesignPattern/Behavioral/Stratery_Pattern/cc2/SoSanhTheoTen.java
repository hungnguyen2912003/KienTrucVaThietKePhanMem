package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        return t1.hoTen.compareTo(t2.hoTen);
    }
}
