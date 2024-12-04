package Part2_DesignPattern.Structural.Decorator_Pattern.b1;

public class Cong extends BieuThucDecorator{

    float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return super.giaTri() + toanHang;
    }

    @Override
    String bieuThuc() {
        return super.bieuThuc() + "+" + toanHang;
    }
}
