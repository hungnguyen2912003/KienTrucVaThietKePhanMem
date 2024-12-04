package creational.factory_method;

public class VN_HaiSanPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Chuẩn bị bột gạo và hải sản");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng trên lò than trong 15 phút");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Gói lá chuối");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Cắt thành 4 miếng");
    }
}
