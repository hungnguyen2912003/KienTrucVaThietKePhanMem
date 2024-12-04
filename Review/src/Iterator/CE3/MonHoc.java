package Iterator.CE3;

public class MonHoc {
    public String id;
    public String name;
    public int soTC;

    public MonHoc(String id, String name, int soTC) {
        this.id = id;
        this.name = name;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
