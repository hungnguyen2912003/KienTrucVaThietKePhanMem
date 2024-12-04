package Part2_DesignPattern.Structural.Composite_Pattern.b4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{

    List<KeHoachHocTap> list = new ArrayList<>();



    public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    int soTC() {
        int tongTC = 0;
        for(KeHoachHocTap kh : list){
            tongTC += kh.soTC();
        }
        return tongTC;
    }

    @Override
    double hocPhi() {
        double tongHP = 0;
        for(KeHoachHocTap kh : list){
            tongHP += kh.hocPhi();
        }
        return tongHP;
    }

    @Override
    String thongTin() {
        StringBuilder builder = new StringBuilder();

        builder.append(ten).append("\t")
                .append("Số tín chỉ: ").append(soTC()).append("\t")
                .append("Học phí: ").append(hocPhi());
        for(KeHoachHocTap k : list){
            //p để thụt dòng
            k.p = this.p + "\t";
            builder.append("\n").append(k.p)
                    .append(k.thongTin());
            k.p = "";
        }

        return builder.toString();
    }

    @Override
    KeHoachHocTap add(KeHoachHocTap kh) {
        list.add(kh);
        return kh;
    }

    @Override
    void remove(KeHoachHocTap kh) {
        list.remove(kh);
    }
}
