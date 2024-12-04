package Iterator.CE3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main_CE3 {

    static void duyetmonHoc(Iterator<MonHoc> iterator){
        while(iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }


    public static void main(String[] args) {
        ArrayList<MonHoc> monHocs = new ArrayList<MonHoc>(Arrays.asList(
                new MonHoc("1", "Kiến trúc máy tính", 3),
                new MonHoc("2", "Chủ nghĩa xã hội", 2),
                new MonHoc("3", "Lập trình thiết bị di động", 3),
                new MonHoc("4", "Thế chất", 1)
        ));

        duyetmonHoc(monHocs.iterator());
    }
}
