package Decorator;

public class UpgradeStorage extends ComputerDecorator{
    String addStorage;
    int vnewStorage;

    public UpgradeStorage(Computer pc, String addStorage, int vnewStorage) {
        super(pc);
        this.addStorage = addStorage;
        this.vnewStorage = vnewStorage;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build()).append("\n");
        builder.append("Nâng cấp thêm: ").append(addStorage).append("\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + vnewStorage;
    }
}
