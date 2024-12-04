package Part2_DesignPattern.Behavioral.Stratery_Pattern.cc1;

public class context {
    //Sử dụng thành phần tuỳ biến thông qua một đối tượng đại diện.
    private Tinh tinhToan;

    //Setter được sử dụng để gán một đối tượng cụ thể cho biến đại diện khi sử dụng.
    public context setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
        return this;
    }

    public float tinh(float a, float b){
        return tinhToan.tinh(a,b);
    }
}
