package Part2_DesignPattern.Creational.Template_Method_Pattern.cd1;

import java.util.List;

public class KH_ThanThiet extends HoaDon{

    @Override
    Double tinhChietKhau() {
        if(tinhTien() >= 500000)
            return tinhTien() * 0.02;
        return 0.0;
    }
}
