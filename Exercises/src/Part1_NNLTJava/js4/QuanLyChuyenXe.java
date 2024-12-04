package Part1_NNLTJava.js4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe{
    private List<ChuyenXe> ls = new ArrayList<>();
    public void Them(ChuyenXe c){
        //Kiểm tra nếu đã có chuyến xe trong danh sách thì dừng
        for(ChuyenXe cxe : ls){
            if(cxe.getMasochuyen().equals(c.getMasochuyen())){
                return;
            }
        }
        //Thêm chuyến xe nếu chưa có trong danh sách
        ls.add(c);
    }

    public void Xuat(){
        for(ChuyenXe c : ls){
            System.out.println(c.Xuat());
        }
    }

    public double DoanhThuNoiThanh(){
        double doanhthu = 0;
        for(ChuyenXe c : ls){
            if(c instanceof XeNoiThanh){
                doanhthu += c.getDoanhThu();
            }
        }
        return doanhthu;
    }

    public double DoanhThuNgoaiThanh(){
        double doanhthu = 0;
        for(ChuyenXe c : ls){
            if(c instanceof XeNgoaiThanh){
                doanhthu += c.getDoanhThu();
            }
        }
        return doanhthu;
    }

    public double TongDoanhThu(){
        double doanhthu = 0;
        for(ChuyenXe c : ls){
            doanhthu += c.getDoanhThu();
        }
        return doanhthu;
    }
}
