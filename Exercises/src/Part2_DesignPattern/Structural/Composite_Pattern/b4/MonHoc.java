package Part2_DesignPattern.Structural.Composite_Pattern.b4;

public class MonHoc extends KeHoachHocTap{

    int soTC;

    double hocPhiTC;

    public MonHoc(String ten, int soTC, double hocPhiTC) {
        super(ten);
        this.soTC = soTC;
        this.hocPhiTC = hocPhiTC;
    }

    @Override
    int soTC() {
        return soTC;
    }

    @Override
    double hocPhi() {
        return hocPhiTC * soTC;
    }

    @Override
    String thongTin() {
        StringBuilder builder = new StringBuilder();

        builder.append(ten).append("\t")
                .append("Số tín chỉ: ").append(soTC).append("\t")
                .append("Học phí: ").append(hocPhiTC);

        return builder.toString();
    }

    @Override
    KeHoachHocTap add(KeHoachHocTap kh) {
        return kh;
    }

    @Override
    void remove(KeHoachHocTap kh) {

    }
}
