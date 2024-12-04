package behavioral.Interator.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    static void duyetMonHocs(Iterator<MonHoc> iterator){
        while(iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<MonHoc> monHocs = new ArrayList<MonHoc>(Arrays.asList(
                new MonHoc("Thể dục", 1),
                new MonHoc("Kiến trúc và thiết kế phần mềm", 3),
                new MonHoc("Lập trình thiết bị di động", 3),
                new MonHoc("Lịch sử Cộng sản Đảng", 2),
                new MonHoc("Toán rời rạc", 3),
                new MonHoc("Vật lý đại cương", 2)
        ));

        duyetMonHocs(monHocs.iterator());
    }

}
