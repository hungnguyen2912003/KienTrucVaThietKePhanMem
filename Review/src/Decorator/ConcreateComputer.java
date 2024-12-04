package Decorator;

public class ConcreateComputer extends Computer{

    public ConcreateComputer(String mainboard, String cpu, int ram, int storage, String screen, int vMainboard, int vCPU, int vRam, int vStorage, int vScreen) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.vMainboard = vMainboard;
        this.vCPU = vCPU;
        this.vRam = vRam;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mainboard: " + mainboard + "\n")
                .append("CPU: " + cpu + "\n")
                .append("RAM: " + ram + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen + "\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return vMainboard + vCPU + vRam + vStorage + vScreen;
    }
}
