package creational.factory_method;

public class VN_NamPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Chuẩn bị bột và nấm");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng bánh trên lò trong 10 phút");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Bỏ vào hộp vuông");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Cắt thành 8 miếng");
    }
}
