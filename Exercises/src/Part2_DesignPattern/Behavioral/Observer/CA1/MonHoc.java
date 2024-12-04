package Part2_DesignPattern.Behavioral.Observer.CA1;

public class MonHoc {
    String maMonHoc;
    String tenMonHoc;
    int soTC;
    public MonHoc(String maMonHoc, String tenMonHoc, int soTC) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã môn học: ").append(maMonHoc).append("\t\t")
                .append("Tên môn học: ").append(tenMonHoc).append("\t\t")
                .append("Số tín chỉ: ").append(soTC).append("\n");
        return builder.toString();
    }
}
