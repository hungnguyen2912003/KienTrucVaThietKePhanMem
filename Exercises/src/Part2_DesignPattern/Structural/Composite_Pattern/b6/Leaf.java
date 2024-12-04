package Part2_DesignPattern.Structural.Composite_Pattern.b6;

public class Leaf extends BNode{

    BNode left;
    BNode right;

    public Leaf(int value) {
        super(value);
    }

    @Override
    void add(BNode n) {
        this.left = n;
    }

    @Override
    void addR(BNode n) {
        this.right = n;
    }

    @Override
    void remove(BNode n) {

    }

    @Override
    void removeR(BNode n) {

    }

    @Override
    String duyet() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);

        return builder.toString();
    }
}
