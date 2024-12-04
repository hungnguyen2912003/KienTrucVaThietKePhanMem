package Part2_DesignPattern.Creational.Builder_Pattern.a7;

public class Computer {
    String CPU;
    String RAM;
    String SCREEN;
    String HARD_DISK;

    public Computer(ComputerBuilder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.SCREEN = b.SCREEN;
        this.HARD_DISK = b.HARD_DISK;
    }

    public String toString(){
        return "CPU: " + CPU + "\tRAM: " + RAM + "\tMàn hình: " + SCREEN + "\tÔ cứng: " + HARD_DISK;
    }

    public static class ComputerBuilder{
        private String CPU;
        private String RAM;
        private String SCREEN;
        private String HARD_DISK;

        public ComputerBuilder addCPU(String c){
            this.CPU = c;
            return this;
        }

        public ComputerBuilder addRAM(String r){
            this.RAM = r;
            return this;
        }

        public ComputerBuilder addSCREEN(String s){
            this.SCREEN = s;
            return this;
        }

        public ComputerBuilder addHD(String h){
            this.HARD_DISK = h;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
