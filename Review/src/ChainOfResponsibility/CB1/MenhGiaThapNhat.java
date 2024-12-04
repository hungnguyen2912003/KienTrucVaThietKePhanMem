package ChainOfResponsibility.CB1;

public class MenhGiaThapNhat extends ATM{

    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM menhGiaKeTiep(ATM keTiep) {
        return null;
    }

    @Override
    void rutTien(int soTien) {
        System.out.println(soTien + " tờ mệnh giá " + menhGia);
    }
}
