package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> ds = new ArrayList<>();
    ThanhToan thanhToan;
    VanChuyen vanChuyen;
    KhuyenMai khuyenMai;

    public void setThanhToan(ThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(VanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void Them(MatHang mh){
        ds.add(mh);
    }

    public double TongTienMatHang(){
        double tong = 0;
        for(MatHang matHang : ds){
            tong += matHang.DonGia;
        }
        return tong;
    }

    public double PhiVanChuyen(){
        return vanChuyen.PhiVanChuyen();
    }

    public double Voucher(){
        return khuyenMai.Voucher(TongTienMatHang());
    }

    public double UuDaiSDThanhToan(){
        return thanhToan.Payment(TongTienMatHang());
    }

    public double TinhToan(){
        Double tongtienmathang = TongTienMatHang();
        Double tiengiamgiathanhtoan = UuDaiSDThanhToan();
        Double phivanchuyen = PhiVanChuyen();
        Double magiamgia = Voucher();

        //Công thức: Tiền các mặt hàng - Tiền giảm giá khi sử dụng hình thức thanh toán - Tiền áp mã giảm giá + Tiền vận chuyển
        return tongtienmathang - tiengiamgiathanhtoan - magiamgia + phivanchuyen;
    }

    public void HienThi(){
        String st = "Tổng tiền mặt hàng trong giỏ: " + TongTienMatHang() + "\n" +
                "Giảm giá khi sử dụng các hình thức thanh toán: " + UuDaiSDThanhToan() + "\n" +
                "Mã giảm giá: " + Voucher() + "\n" +
                "Phí vận chuyển: " + PhiVanChuyen();
        System.out.println(st);
    }
}
