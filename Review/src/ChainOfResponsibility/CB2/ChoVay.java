package ChainOfResponsibility.CB2;

public abstract class ChoVay {

    String tenNguoiDuyet, chucVu, duanVay;
    int hanMucVay;

    public ChoVay(String tenNguoiDuyet, String chucVu, String duanVay, int hanMucVay) {
        this.tenNguoiDuyet = tenNguoiDuyet;
        this.chucVu = chucVu;
        this.duanVay = duanVay;
        this.hanMucVay = hanMucVay;
    }

    abstract ChoVay khoanVayKeTiep(ChoVay keTiep);

    public abstract void vayTien(int soTienVay);
}
