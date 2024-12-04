package Decorator;

public class UpgradeCPU extends ComputerDecorator{
    String replaceCPU;
    int vnewCPU;

    public UpgradeCPU(Computer pc, String replaceCPU, int vnewCPU) {
        super(pc);
        this.replaceCPU = replaceCPU;
        this.vnewCPU = vnewCPU;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build()).append("\n");
        builder.append("Thay thế: ").append(replaceCPU).append("\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() - pc.getvCPU() + vnewCPU;
    }

    @Override
    public int getvCPU() {
        return vnewCPU;
    }
}
