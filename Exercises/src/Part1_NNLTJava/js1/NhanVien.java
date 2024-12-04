package Part1_NNLTJava.js1;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongsogiolam;

    public NhanVien() {

    }

    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tongsogiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tongsogiolam = tongsogiolam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }

    public String ToString() {
        return  "Tên: " + ten + "\n" +
                "Tuổi: " + tuoi + "\n" +
                "Địa chỉ: " + diachi + "\n" +
                "Tiền lương: " + tienluong + "\n" +
                "Tổng số giờ làm: " + tongsogiolam + "\n" +
                "Tiền thưởng: " + tinhThuong();
    }

    public double tinhThuong(){
        if(tongsogiolam >= 200) return tienluong * 0.2;
        else if(tongsogiolam >= 100)  return tienluong * 0.1;
        return 0;
    }
}

