package ChainOfResponsibility.CB1;

public class MenhGiaThongThuong extends ATM{

    ATM keTiep;

    public MenhGiaThongThuong(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM menhGiaKeTiep(ATM keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        soTien %= menhGia;
        System.out.println(soTo + " tờ mệnh giá " + menhGia);
        if(soTien > 0)
            keTiep.rutTien(soTien);
    }
}
