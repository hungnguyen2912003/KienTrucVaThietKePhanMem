package ChainOfResponsibility.CB2;

public class ChucVuThongThuong extends ChoVay{

    ChoVay choVay;

    public ChucVuThongThuong(String tenNguoiDuyet, String chucVu, String duanVay, int hanMucVay) {
        super(tenNguoiDuyet, chucVu, duanVay, hanMucVay);
    }

    @Override
    ChoVay khoanVayKeTiep(ChoVay keTiep) {
        this.choVay = keTiep;
        return choVay;
    }

    @Override
    public void vayTien(int soTienVay) {
        if(soTienVay <= hanMucVay){
            System.out.println("Bạn đã vay thành công: " + soTienVay);
            System.out.println("Tên người duyệt: " + tenNguoiDuyet + "\t" + "Chức vụ: " + chucVu);
        }
        else{
            choVay.vayTien(soTienVay);
        }
    }
}
