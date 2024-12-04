package Part2_DesignPattern.Behavioral.Observer.CA5;

public class TaiKhoan implements TaiKhoanATM{
    String tenTK;

    int soDu;

    ATM atm;
    

    public TaiKhoan(String tenTK, int soDu, ATM atm) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.nhanThe(this);
    }

    public void rutTheKhoiATM(){
        atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soDu - 50 > soTienRut){
            return true;
        }
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong == true){
            System.out.println("Tài khoản: " + tenTK);
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("Số dư sau khi rút: " + soDu);
        }
        else{
            System.out.println("Tài khoản: " + tenTK);
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + soTienRut);
            System.out.println("Không đủ tiền để rút");
        }
    }
}
