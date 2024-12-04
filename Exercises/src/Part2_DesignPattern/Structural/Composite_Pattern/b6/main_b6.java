package Part2_DesignPattern.Structural.Composite_Pattern.b6;

public class main_b6 {
    public static void main(String[] args) {
        BNode n1 = new InnerNode(3);

        BNode n2 = new InnerNode(4);

        n1.add(n2);

        BNode n3 = new InnerNode(5);
        BNode n4 = new InnerNode(6);

        n2.add(n3);

        n2.addR(n4);

        BNode n5 = new InnerNode(7);

        n1.addR(n5);

        BNode n6 = new InnerNode(8);
        BNode n7 = new InnerNode(9);

        n5.add(n6);
        n5.addR(n7);

        System.out.println(n1.duyet());
    }
}
