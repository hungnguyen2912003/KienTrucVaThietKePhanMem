package Iterator.CE1;

public class Main_CE1 {
    public static void main(String[] args) {
        ArrayCollection arrCe1 = new ArrayCollection();
        Iterator iterator = arrCe1.CreateIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.Next());
        }
    }
}
