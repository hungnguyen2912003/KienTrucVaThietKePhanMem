package Part2_DesignPattern.Behavioral.Interator.CE1;

public class ArrayIteratorCE1 implements IteratorCE1 {
    ArrayCollectionCE1 collection;
    int index = -1;

    protected ArrayIteratorCE1(ArrayCollectionCE1 collection) {
        this.collection = collection;
    }

    @Override
    public Object First() {
        if(collection.count() > 0){
            index = 0;
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    public Object Next() {
        if(!isDone())
            return collection.getItem(++index);
        return null;
    }

    @Override
    public boolean isDone() {
        return (index == collection.count() - 1);
    }

    @Override
    public Object CurrentItem() {
        if(index >= 0){
            return collection.getItem(index);
        }
        return null;
    }
}
