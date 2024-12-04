package creational.builder;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("AMD Ryzen 5500U")
                .addRAM("16GB Kingston")
                .addStorage("512GB MVMe")
                .addScreen("17 inches LG")
                .build();
        System.out.println(computer.toString());
    }
}