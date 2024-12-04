package creational.builder;

//1. Lớp có đối tượng cần xây dựng với nhiều thành phần
public class Computer {
    //Các thành phần cần xây dựng, việc xây dựng các thành phần này là phức tạp
    String CPU, RAM, storage, screen;

    //Protected - Có thừa kế
    //Private - Không thừa kế
    //3. Hàm khởi tạo, khởi tạo đối tượng cần xây dựng từ đối tượng builder. Không sử dụng bổ từ truy cập public cho hàm khởi tạo này.
    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    //2. Lớp Builder có nhiệm vụ xây dựng các thành phần cho đối tượng cần khởi tạo (Computer)
    public static class Builder implements ComputerBuilder{
        private String CPU, RAM, storage, screen;

        //Phương thức xây dựng 1 thành phần của Computer

        @Override
        public ComputerBuilder addCPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        @Override
        public ComputerBuilder addRAM(String ram) {
            this.RAM = ram;
            return this;
        }

        @Override
        public ComputerBuilder addStorage(String storage) {
            this.storage = storage;
            return this;
        }

        @Override
        public ComputerBuilder addScreen(String screen) {
            this.screen = screen;
            return this;
        }

        @Override
        public Computer build() {
            return new Computer(this);
        }
    }
}
