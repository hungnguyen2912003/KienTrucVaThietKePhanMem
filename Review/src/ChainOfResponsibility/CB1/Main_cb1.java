package ChainOfResponsibility.CB1;

public class Main_cb1 {
    public static void main(String[] args) {
//        ATM menhGia500 = new MenhGiaThongThuong(500);
//        ATM menhGia100 = new MenhGiaThongThuong(100);
//        ATM menhGia50 = new MenhGiaThongThuong(50);
//        ATM menhGia10 = new MenhGiaThongThuong(10);
//        ATM menhGia1 = new MenhGiaThapNhat(1);
//
//        menhGia500.menhGiaKeTiep(menhGia100)
//                .menhGiaKeTiep(menhGia50)
//                .menhGiaKeTiep(menhGia10)
//                .menhGiaKeTiep(menhGia1);
//
//        menhGia500.rutTien(293);

        ATMFactory factory = new ChuoiMenhGiaVND();
        factory.rutTien(293, 50);
    }
}
