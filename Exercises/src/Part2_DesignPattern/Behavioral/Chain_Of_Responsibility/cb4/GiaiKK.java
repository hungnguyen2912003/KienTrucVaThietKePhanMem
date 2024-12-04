package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb4;

import java.util.List;

public class GiaiKK extends GiaiThuong{
    GiaiThuong keTiep;

    public GiaiKK(String tenGiai, List<String> soTrungThuongs) {
        super(tenGiai, soTrungThuongs);
    }

    @Override
    GiaiThuong giaiKeTiep(GiaiThuong GiaikeTiep) {
        keTiep = GiaikeTiep;
        return keTiep;
    }

    @Override
    void doVeSo(String veSo) {

    }


}
