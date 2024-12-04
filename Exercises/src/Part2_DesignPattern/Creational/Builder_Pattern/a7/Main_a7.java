package Part2_DesignPattern.Creational.Builder_Pattern.a7;

public class Main_a7 {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .addCPU("R5 5500U")
                .addRAM("16GB")
                .addSCREEN("15'6 Inches")
                .addHD("512GB")
                .build();
        System.out.println(computer.toString());
    }
}
