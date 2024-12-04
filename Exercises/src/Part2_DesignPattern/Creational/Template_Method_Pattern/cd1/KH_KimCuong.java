package Part2_DesignPattern.Creational.Template_Method_Pattern.cd1;

import java.util.List;

public class KH_KimCuong extends HoaDon{

    @Override
    Double tinhChietKhau() {
        if(tinhTien() >= 500000)
            return tinhTien() * 0.03;
        else if(tinhTien() >= 1000000)
            return tinhTien() * 0.05;
        else if(tinhTien() >= 1500000)
            return tinhTien() * 0.06;
        return 0.0;
    }
}
