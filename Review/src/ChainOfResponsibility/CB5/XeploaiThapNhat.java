package ChainOfResponsibility.CB5;

public class XeploaiThapNhat extends XepLoai{

    public XeploaiThapNhat(String xepLoai, float diemSo) {
        super(xepLoai, diemSo);
    }

    @Override
    XepLoai XepLoaiKeTiep(XepLoai keTiep) {
        return null;
    }

    @Override
    String xuLyXepLoai(float diem) {
        return this.xepLoai;
    }
}
