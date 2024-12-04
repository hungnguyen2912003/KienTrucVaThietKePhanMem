package Decorator;

public abstract class ComputerDecorator extends Computer {
    Computer pc;

    public ComputerDecorator(Computer pc) {
        this.pc = pc;
    }
}
