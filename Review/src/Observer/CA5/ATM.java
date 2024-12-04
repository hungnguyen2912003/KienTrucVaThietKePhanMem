package Observer.CA5;

public class ATM {
    TaiKhoanATM theATM;

    public void AttachATM(TaiKhoanATM theATM) {
        this.theATM = theATM;
    }

    public void DetachATM(TaiKhoanATM theATM) {
        this.theATM = null;
    }

    public void rutTien(double soTien){
        if(theATM != null)
        {
            if(theATM.KiemTraSoDu(soTien) == true)
            {
                theATM.nhanThongBao(soTien, true);
            }
            else{
                theATM.nhanThongBao(soTien, false);
            }
        }
        else{
            System.out.println("Không có thẻ");
        }
    }
}
