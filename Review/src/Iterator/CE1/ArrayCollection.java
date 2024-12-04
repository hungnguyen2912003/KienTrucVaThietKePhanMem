package Iterator.CE1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCollection extends Collection{

    private ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    public int getItem(int i){
        return arr.get(i);
    }

    public int count(){
        return arr.size();
    }

    @Override
    Iterator CreateIterator() {
        return new ArrayIterator(this);
    }
}
