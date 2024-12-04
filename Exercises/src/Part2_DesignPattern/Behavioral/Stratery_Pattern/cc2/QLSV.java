package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {

    ISoSanh soSanh;

    List<SinhVien> ls = new ArrayList<>();

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    public void Them(SinhVien sv){
        //Thêm chuyến xe nếu chưa có trong danh sách
        ls.add(sv);
    }

    public void sapXep(){
        for(int i = 0; i < ls.size() - 1; i++){
            for(int j = i + 1; j < ls.size(); j++){
                //Nếu phần tử i lớn hơn phần tử j
                if(soSanh.soSanh(ls.get(i), ls.get(j)) > 0){
                    //Chuyển j về i
                    SinhVien s = ls.get(i);     //Lấy bản sao phần tử i
                    ls.set(i, ls.get(j));       //Lấy bản sao phần tử j đặt vào vị trí i
                    ls.set(j, s);
                }
            }
        }
    }

    public void inDS(){
        for(SinhVien s : ls){
            System.out.println(s.toString());
        }
    }

    public void sapXep2(){
        ls.sort((o1, o2) -> soSanh.soSanh(o1, o2));
    }
}
