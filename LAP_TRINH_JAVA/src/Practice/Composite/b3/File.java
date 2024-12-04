package Practice.Composite.b3;

public class File extends Explorer{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getStringTreeFolder() {
        return ten;
    }

    @Override
    public String getPath() {
        return ten;
    }

    @Override
    public Explorer addItem(Explorer item) {
        return null;
    }

    @Override
    public void removeItem(Explorer item) {

    }
}
