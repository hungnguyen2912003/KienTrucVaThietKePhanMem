package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_cb4 {
    public static void main(String[] args) {
        GiaiThuong giaidb = new GiaiThongThuong("Giải đặc biệt", new ArrayList<String>(Arrays.asList("642857")));
        GiaiThuong giaiNhat = new GiaiThongThuong("Giải nhất", new ArrayList<String>(Arrays.asList("314913")));
        GiaiThuong giaiNhi = new GiaiThongThuong("Giải Nhì", new ArrayList<String>(Arrays.asList("200195", "244000")));
        GiaiThuong giaiBa = new GiaiThongThuong("Giải Ba", new ArrayList<String>(Arrays.asList("920569", "637021", "522931")));
        GiaiThuong giaiTu = new GiaiThongThuong("Giải Tư", new ArrayList<String>(Arrays.asList("106285", "387648", "836827", "261586")));
        GiaiThuong giaiNam = new GiaiThongThuong("Giải Năm", new ArrayList<String>(Arrays.asList("561311")));
        GiaiThuong giaiSau = new GiaiThongThuong("Giải Sáu", new ArrayList<String>(Arrays.asList("245237", "635464", "867684")));
        GiaiThuong giaiBay = new GiaiThongThuong("Giải Bảy", new ArrayList<String>(Arrays.asList("432360")));
        GiaiThuong giaiTam = new GiaiUt("Giải Tám", new ArrayList<String>(Arrays.asList("224159")));

        giaidb.giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiNhi)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiNam)
                .giaiKeTiep(giaiSau)
                .giaiKeTiep(giaiBay)
                .giaiKeTiep(giaiTam);

        System.out.println("Vé 1");
        giaidb.doVeSo("637021");
        System.out.println("Vé 2");
        giaidb.doVeSo("224000");
    }
}
