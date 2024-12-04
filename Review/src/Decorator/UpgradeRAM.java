package Decorator;

public class UpgradeRAM extends ComputerDecorator{
    int addRam;
    int vnewRam;
    public UpgradeRAM(Computer computer, int addRam, int vnewRam) {
        super(computer);
        this.addRam = addRam;
        this.vnewRam = vnewRam;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nâng cấp thêm: ").append(addRam + " RAM");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + vnewRam;
    }

    @Override
    public int getRam() {
        return pc.getRam() + addRam;
    }

    @Override
    public int getvRam() {
        return pc.getvRam() + vnewRam;
    }
}
