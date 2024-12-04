package Observer.CA5;

public class TaiKhoan implements TaiKhoanATM{
    String ten;
    double soDu;
    ATM atm;

    public TaiKhoan(String ten, double soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.AttachATM(this);
    }

    public void rutTheKhoiATM(){
        atm.DetachATM(this);
    }

    @Override
    public boolean KiemTraSoDu(double soTienRut) {
        if(soDu - 50 > soTienRut)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(double soTien, boolean trangThai) {

    }
}
