package Part2_DesignPattern.Structural.Composite_Pattern.b3;

public class File extends B3Abstract{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    String getStringTreeFolder() {
        return ten;
    }

    @Override
    String getPath() {
        return ten;
    }

    @Override
    B3Abstract addItem(B3Abstract file) {
        return null;
    }

    @Override
    void removeItem(B3Abstract file) {

    }
}
