package Part2_DesignPattern.Behavioral.Observer.CA4;

public class TinTuc {
    public String noiDung;
    public int maTin;

    public TinTuc(String noiDung, int maTin) {
        this.noiDung = noiDung;
        this.maTin = maTin;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Nội dung: ").append(noiDung).append("\t").append("Mã tin: ").append(maTin);
        return b.toString();
    }
}
