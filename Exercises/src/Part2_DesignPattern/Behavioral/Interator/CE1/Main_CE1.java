package Part2_DesignPattern.Behavioral.Interator.CE1;

public class Main_CE1 {
    public static void main(String[] args) {
        ArrayCollectionCE1 array = new ArrayCollectionCE1();
        IteratorCE1 iterator = array.createIterator();

        while (!iterator.isDone()){
            System.out.println(iterator.Next());
        }
    }
}
