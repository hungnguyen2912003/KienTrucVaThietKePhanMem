package Part2_DesignPattern.Creational.Template_Method_Pattern.cd1;

import java.util.List;

public class KH_Vang extends HoaDon{

    @Override
    Double tinhChietKhau() {
        if(tinhTien() >= 500000)
            return tinhTien() * 0.03;
        else if(tinhTien() >= 1000000)
            return tinhTien() * 0.05;
        return 0.0;
    }
}
