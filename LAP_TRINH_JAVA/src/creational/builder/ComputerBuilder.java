package creational.builder;

public interface ComputerBuilder {
    ComputerBuilder addCPU(String cpu);
    ComputerBuilder addRAM(String ram);
    ComputerBuilder addStorage(String storage);
    ComputerBuilder addScreen(String screen);
    Computer build();
}
