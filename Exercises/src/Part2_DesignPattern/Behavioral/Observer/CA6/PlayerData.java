package Part2_DesignPattern.Behavioral.Observer.CA6;

public class PlayerData {
    private PlayerDataListener listener;
    private int thoiGian, soLuotChoi, diemSo;

    public PlayerData(int thoiGian, int soLuotChoi, int diemSo) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diemSo = diemSo;
    }

    public void dangKy(PlayerDataListener listener){
        this.listener = listener;
        this.listener.listen(this);
    }

    public void huyDangKy(PlayerDataListener listener){
        this.listener = null;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        listener.listen(this);
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        listener.listen(this);
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
        listener.listen(this);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Thời gian: ").append(thoiGian).append("\t")
                .append("Số lượt: ").append(soLuotChoi).append("\t")
                .append("Điểm số: ").append(diemSo);
        return b.toString();
    }
}
