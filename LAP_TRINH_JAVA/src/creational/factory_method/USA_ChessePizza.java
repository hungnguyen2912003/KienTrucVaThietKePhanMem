package creational.factory_method;

public class USA_ChessePizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Chuẩn bị phô mai và bột mì");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng bánh trong máy");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Bỏ vào hộp vuông");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Cắt thành 4 miếng");
    }
}
