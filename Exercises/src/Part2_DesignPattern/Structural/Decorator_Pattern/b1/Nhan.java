package Part2_DesignPattern.Structural.Decorator_Pattern.b1;

public class Nhan extends BieuThucDecorator{
    float toanHang;

    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return super.giaTri() * toanHang;
    }

    @Override
    String bieuThuc() {
        return "(" + super.bieuThuc() + ")" + "*" + toanHang;
    }
}
