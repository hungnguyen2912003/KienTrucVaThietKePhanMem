package Practice.Composite.b3;

public abstract class Explorer {

    public String ten, ngayTao;

    public String p = "";

    public Explorer(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    public abstract String getStringTreeFolder();

    public abstract String getPath();

    public abstract Explorer addItem(Explorer item);

    public abstract void removeItem(Explorer item);
}
