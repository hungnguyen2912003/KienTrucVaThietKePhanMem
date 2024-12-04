package Part2_DesignPattern.Creational.Template_Method_Pattern.cd1;

import java.util.ArrayList;
import java.util.List;

public abstract class HoaDon {

    List<MatHang> dsmh = new ArrayList<>();


    public Double tinhTien(){
        double tong = 0;
        for (MatHang matHang : dsmh)
            tong += matHang.SoLuong * matHang.DonGia;
        return tong;
    }

    abstract Double tinhChietKhau();

    public void addMH(MatHang matHang){
        dsmh.add(matHang);
    }

    public void HienThiGioHang(){
        for (MatHang matHang : dsmh){
            System.out.println("Tên mặt hàng: " + matHang.tenMatHang + "\t\tSố lượng: " + matHang.SoLuong + "\t\tĐơn giá: " + matHang.DonGia + "\t\tThành tiền: " + (matHang.DonGia * matHang.SoLuong));
        }
        System.out.println("Tổng tiền mua hàng: " + tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền khách hàng cần thanh toán: " + (tinhTien() - tinhChietKhau()));
    }
}
