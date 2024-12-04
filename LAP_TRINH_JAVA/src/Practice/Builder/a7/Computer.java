package Practice.Builder.a7;

public class Computer {

    public String CPU;
    public int RAM;

    public String Screen;

    public int Harddisk;

    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Screen = b.Screen;
        this.Harddisk = b.Harddisk;
    }

    public String inComputer(){
        StringBuilder builder = new StringBuilder();

        builder.append("CPU: ").append(CPU).append("\n")
                .append("RAM: ").append(RAM).append("\n")
                .append("Screen: ").append(Screen).append("\n")
                .append("Hard disk: ").append(Harddisk);


        return builder.toString();
    }

    public static class Builder{
        public String CPU;
        public int RAM;

        public String Screen;

        public int Harddisk;

        public Builder addCPU(String cpu){
            this.CPU = cpu;
            return this;
        }

        public Builder addRAM(int ram){
            this.RAM = ram;
            return this;
        }

        public Builder addScreen(String screen){
            this.Screen = screen;
            return this;
        }

        public Builder addHarddisk(int hd){
            this.Harddisk = hd;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
