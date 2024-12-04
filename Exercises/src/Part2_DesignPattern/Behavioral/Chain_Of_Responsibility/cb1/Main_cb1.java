package Part2_DesignPattern.Behavioral.Chain_Of_Responsibility.cb1;

public class Main_cb1 {
    public static void main(String[] args) {

//        ATM namTram = new MenhGiaATM(500);
//        ATM motTram = new MenhGiaATM(100);
//        ATM namChuc = new MenhGiaATM(50);
//        ATM muoiNghin = new MenhGiaATM(10);
//        ATM motNghin = new MenhGiaThapNhat(1);
//
//        namTram.thietlapMenhGiaThapHon(motTram)
//                .thietlapMenhGiaThapHon(namChuc)
//                .thietlapMenhGiaThapHon(muoiNghin)
//                .thietlapMenhGiaThapHon(motNghin);
//
//        namTram.rutTien(692);

        ChuoiMenhGiaFactory atmVND = new ChuoiMenhGiaVND();
        atmVND.rutTien(293, 50);
    }
}
