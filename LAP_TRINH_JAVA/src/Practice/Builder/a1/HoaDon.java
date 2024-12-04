package Practice.Builder.a1;

import java.util.ArrayList;

public class HoaDon {


    //Sở dĩ phải khai báo hoaDonHeader vào đây để set Tiêu đề và lấy kết quả in ra
    HoaDonHeader hoaDonHeader;

    ArrayList<ChiTietHoaDon> ls;

    private HoaDon(Builder b){
        this.hoaDonHeader = b.hoaDonHeader;
        this.ls = b.ls;
    }

    //in
    public String inHD(){
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader.inHD());
        for(ChiTietHoaDon cthd : ls){
            builder.append(cthd.inHD());
        }
        return builder.toString();
    }

    public static class Builder{
        HoaDonHeader hoaDonHeader;

        ArrayList<ChiTietHoaDon> ls = new ArrayList<>();

        public Builder setHeader(HoaDonHeader hoaDonHeader){
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder addCTHD(ChiTietHoaDon chiTietHoaDon){
            ls.add(chiTietHoaDon);
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
