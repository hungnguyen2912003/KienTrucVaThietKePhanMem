package Part2_DesignPattern.Structural.Decorator_Pattern.b1;

public class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
