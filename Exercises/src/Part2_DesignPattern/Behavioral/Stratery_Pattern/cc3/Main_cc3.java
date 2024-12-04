package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc3;

public class Main_cc3 {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.Them(new MatHang("Áo sơ mi tay ngắn", 100, 300000));
        gioHang.Them(new MatHang("Giày Nike", 30, 1500000));
        gioHang.Them(new MatHang("Quần tây đen", 50, 450000));
        gioHang.Them(new MatHang("Kính Dior", 10, 2000000));

        //Chọn phương thức thanh toán
        gioHang.setThanhToan(new Airpay_Payment());

        //Chọn phương thức vận chuyển
        gioHang.setVanChuyen(new GiaoHangNhanh_Shipping());

        //Chọn Voucher
        gioHang.setKhuyenMai(new Voucher(30, 100000));

        //Hiển thị chi tiết tổng tiền mặt hàng
        gioHang.HienThi();

        //Tổng tiền thanh toán
        System.out.println("Tổng tiền cần thanh toán: " + gioHang.TinhToan());
    }
}
