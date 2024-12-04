package Part2_DesignPattern.Behavioral.Interator.CE1;

public class ArrayCollectionCE1 extends CollectionCE1{

    private int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    public int getItem(int i){
        return arr[i];
    }

    public int count(){
        return arr.length;
    }

    @Override
    IteratorCE1 createIterator() {
        return new ArrayIteratorCE1(this);
    }
}
