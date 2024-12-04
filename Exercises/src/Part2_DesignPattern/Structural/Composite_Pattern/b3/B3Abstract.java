package Part2_DesignPattern.Structural.Composite_Pattern.b3;

public abstract class B3Abstract {
    String ten, ngayTao;

    String p = "";

    public B3Abstract(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    abstract String getStringTreeFolder();

    abstract String getPath();

    abstract B3Abstract addItem(B3Abstract file);

    abstract void removeItem(B3Abstract file);
}
