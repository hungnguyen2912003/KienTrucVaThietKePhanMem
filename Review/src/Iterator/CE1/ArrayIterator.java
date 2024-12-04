package Iterator.CE1;

public class ArrayIterator extends Iterator {
    ArrayCollection collection;
    int index = -1;

    public ArrayIterator(ArrayCollection collection) {
        this.collection = collection;
    }

    @Override
    Object First() {
        if(collection.count() > 0){
            index = 0;
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    Object Next() {
        if(!isDone()){
            return collection.getItem(++index);
        }
        return null;
    }

    @Override
    boolean isDone() {
        return index >= collection.count() - 1;
    }

    @Override
    Object CurrentItem() {
        if(index >= 0){
            return collection.getItem(index);
        }
        return null;
    }
}
