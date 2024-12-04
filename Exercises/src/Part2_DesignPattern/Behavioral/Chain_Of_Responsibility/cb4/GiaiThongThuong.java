package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb4;

import java.util.List;

public class GiaiThongThuong extends GiaiThuong {

    GiaiThuong keTiep;

    public GiaiThongThuong(String tenGiai, List<String> soTrungThuongs) {
        super(tenGiai, soTrungThuongs);
    }

    @Override
    GiaiThuong giaiKeTiep(GiaiThuong GiaikeTiep) {
        keTiep = GiaikeTiep;
        return keTiep;
    }

    @Override
    void doVeSo(String veSo){
        for(String s : soTrungThuongs){
            if(veSo.endsWith(s)){
                System.out.println("Bạn đã trúng: " + tenGiai);
                return;
            }
        }
        keTiep.doVeSo(veSo);
    }
}

