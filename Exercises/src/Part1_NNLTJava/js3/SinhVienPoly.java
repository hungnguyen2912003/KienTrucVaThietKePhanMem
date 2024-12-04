package Part1_NNLTJava.js3;

abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    //Vì chưa biết sinh viên học những môn nào nên chưa tính được điểm => getDiem() là phương thức trừu tượng

    abstract double getDiem();

    public String getHocLuc(){
        if(getDiem() < 5){
            return "Yếu";
        }
        else if(getDiem() >= 5 && getDiem() < 6.5){
            return "Trung bình";
        }
        else if(getDiem() >= 6.5 && getDiem() < 7.5){
            return "Khá";
        }
        else if(getDiem() >= 7.5 && getDiem() < 9){
            return "Giỏi";
        }
        else
            return "Xuất sắc";
    }

    public void Xuat(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
    }
}
