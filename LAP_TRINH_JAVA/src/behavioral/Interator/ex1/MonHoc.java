package behavioral.Interator.ex1;

public class MonHoc {
    String ten;
    int soTC;

    public MonHoc(String ten, int soTC) {
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "ten='" + ten + '\'' +
                ", soTC=" + soTC +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
}
