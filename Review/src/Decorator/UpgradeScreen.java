package Decorator;

public class UpgradeScreen extends ComputerDecorator{
    String addScreen;
    int vnewScreen;

    public UpgradeScreen(Computer pc, String addScreen, int vnewScreen) {
        super(pc);
        this.addScreen = addScreen;
        this.vnewScreen = vnewScreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build()).append("\n");
        builder.append("Thay thế màn hình: ").append(addScreen).append("\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() - vScreen + vnewScreen;
    }
}
