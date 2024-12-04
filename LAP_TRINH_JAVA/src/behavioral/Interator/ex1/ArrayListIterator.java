package behavioral.Interator.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

    public static void main(String[] args) {
        //List là một lớp trừu tượng, ArrayList là lớp cụ thể của trừu tượng đó
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
