package ChainOfResponsibility.CB5;

public class XepLoaiThongThuong extends XepLoai{

    XepLoai keTiep;

    public XepLoaiThongThuong(String xepLoai, float diemSo) {
        super(xepLoai, diemSo);
    }

    @Override
    XepLoai XepLoaiKeTiep(XepLoai keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    String xuLyXepLoai(float diem) {
        if (diem >= this.diemSo) {
            return this.xepLoai;
        } else if (keTiep != null) {
            return keTiep.xuLyXepLoai(diem);
        } else {
            return "Không có xếp loại phù hợp";
        }
    }
}
