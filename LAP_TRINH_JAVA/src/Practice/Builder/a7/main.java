package Practice.Builder.a7;

public class main {
    public static void main(String[] args) {
        Computer cp1 = new Computer.Builder()
                .addCPU("AMD Ryzen 5")
                .addRAM(32)
                .addScreen("LG")
                .addHarddisk(512)
                .build();
        System.out.println(cp1.inComputer());
    }
}
