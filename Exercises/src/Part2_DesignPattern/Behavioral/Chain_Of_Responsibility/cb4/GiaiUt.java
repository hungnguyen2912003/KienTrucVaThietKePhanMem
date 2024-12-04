package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb4;

import java.util.List;

public class GiaiUt extends GiaiThuong {


    public GiaiUt(String tenGiai, List<String> soTrungThuongs) {
        super(tenGiai, soTrungThuongs);
    }

    @Override
    GiaiThuong giaiKeTiep(GiaiThuong keTiep) {
        return null;
    }

    @Override
    void doVeSo(String veSo) {
        for(String s : soTrungThuongs){
            if(s.endsWith(veSo)){
                System.out.println("Bạn đã trúng: giải Tám");
                return;
            }
        }
        System.out.println("Chúc may mắn lần sau");
    }
}
