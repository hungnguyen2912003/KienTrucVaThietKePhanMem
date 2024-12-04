package Decorator;

public abstract class Computer {
    String mainboard, cpu, screen;
    int ram, storage;
    int vMainboard, vCPU, vRam, vStorage, vScreen;

    public abstract String build();
    public abstract int value();


    public String getMainboard() {
        return mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public int getvCPU() {
        return vCPU;
    }

    public int getvRam() {
        return vRam;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}
