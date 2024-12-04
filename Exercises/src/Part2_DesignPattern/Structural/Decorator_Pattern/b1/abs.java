package Part2_DesignPattern.Structural.Decorator_Pattern.b1;

public class abs extends BieuThucDecorator{

    public abs(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    float giaTri() {
        if(super.giaTri() < 0)
            return Math.abs(super.giaTri());
        return super.giaTri();
    }

    @Override
    String bieuThuc() {
        return "|" + super.bieuThuc() + "|";
    }
}
