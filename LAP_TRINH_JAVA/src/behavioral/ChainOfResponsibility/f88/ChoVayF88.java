package behavioral.ChainOfResponsibility.f88;

public abstract class ChoVayF88 {
    int hanMucXuLyVay;
    String ten;
    String chucVu;

    public ChoVayF88(String ten, String chucVu, int hanMucXuLyVay) {
        this.hanMucXuLyVay = hanMucXuLyVay;
        this.ten = ten;
        this.chucVu = chucVu;
    }

    abstract ChoVayF88 capCaoHon(ChoVayF88 capCao);
    abstract String xuLyVay(int soTienVay);
}
