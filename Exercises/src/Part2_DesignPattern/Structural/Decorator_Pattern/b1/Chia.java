package Part2_DesignPattern.Structural.Decorator_Pattern.b1;

public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return super.giaTri() / toanHang;
    }

    @Override
    String bieuThuc() {
        return "(" + super.bieuThuc() + ")" + "/" + toanHang;
    }
}
