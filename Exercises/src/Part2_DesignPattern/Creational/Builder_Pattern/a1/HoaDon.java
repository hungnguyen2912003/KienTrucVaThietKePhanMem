package Part2_DesignPattern.Creational.Builder_Pattern.a1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> ls;

    private HoaDon(Builder b){
        this.header = b.header;
        this.ls = b.ls;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(header.toString());
        for (CTHD cthd : ls){
            builder.append(cthd.toString());
        }
        return builder.toString();
    }

    public void inCTHD(){
        for(CTHD cthd : ls){
            System.out.println("Sản phẩm: " + cthd.SanPham +
                    "\t Số lượng: " + cthd.SoLuong +
                    "\t Đơn giá: " + cthd.DonGia +
                    "\t Chiết khấu: " + cthd.ChietKhau);
        }
    }


    public static class Builder{
        private HoaDonHeader header;
        private List<CTHD> ls = new ArrayList<>();
        public Builder setHeader(HoaDonHeader header){
            this.header = header;
            return this;
        }
        public Builder addCTHD(CTHD cthd){
            ls.add(cthd);
            return this;
        }

        public HoaDon Build(){
            return new HoaDon(this);
        }
    }
}
