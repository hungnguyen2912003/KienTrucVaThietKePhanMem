package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb4;

import java.util.List;

public abstract class GiaiThuong {
    String tenGiai;

    List<String> soTrungThuongs;

    public GiaiThuong(String tenGiai, List<String> soTrungThuongs) {
        this.tenGiai = tenGiai;
        this.soTrungThuongs = soTrungThuongs;
    }

    abstract GiaiThuong giaiKeTiep(GiaiThuong keTiep);

    abstract void doVeSo(String veSo);
}
