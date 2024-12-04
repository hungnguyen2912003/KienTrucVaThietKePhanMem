package ChainOfResponsibility.CB2;

public class ChucVuCaoNhat extends ChoVay{

    public ChucVuCaoNhat(String tenNguoiDuyet, String chucVu, String duanVay, int hanMucVay) {
        super(tenNguoiDuyet, chucVu, duanVay, hanMucVay);
    }

    @Override
    ChoVay khoanVayKeTiep(ChoVay keTiep) {
        return null;
    }

    @Override
    public void vayTien(int soTienVay) {
        if(soTienVay <= hanMucVay){
            System.out.println("Bạn đã vay thành công: " + soTienVay);
            System.out.println("Tên người duyệt: " + tenNguoiDuyet + "\t" + "Chức vụ: " + chucVu);
        }
        else{
            System.out.println("Số tiền quá lớn. Ngân hàng không đủ để vay cho bạn");
        }
    }
}
