package Part2_DesignPattern.Structural.Composite_Pattern.b6;

public abstract class BNode {
    int value;

    String p = "";

    public BNode(int value) {
        this.value = value;
    }

    abstract void add(BNode n);

    abstract void addR(BNode n);

    abstract void remove(BNode n);

    abstract void removeR(BNode n);

    abstract String duyet();
}
