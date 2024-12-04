package ChainOfResponsibility.CB5;

public abstract class XepLoai {

    public String xepLoai;
    public float diemSo;

    public XepLoai(String xepLoai, float diemSo) {
        this.xepLoai = xepLoai;
        this.diemSo = diemSo;
    }

    abstract XepLoai XepLoaiKeTiep(XepLoai keTiep);

    abstract String xuLyXepLoai(float diem);
}
