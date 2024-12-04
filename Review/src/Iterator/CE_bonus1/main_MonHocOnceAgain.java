package Iterator.CE_bonus1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class MonHoc{
    String id;
    String name;
    int soTC;

    public MonHoc(String id, String name, int soTC) {
        this.id = id;
        this.name = name;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "Mã môn học: " + id + "\t" +
                "Tên môn học: " + name + "\t\t\t" +
                "Số tín chỉ: " + soTC;
    }
}

public class main_MonHocOnceAgain {

    static void duyetMonHoc(Iterator<MonHoc> iterator){
        while (iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<MonHoc> ls = new ArrayList<>(Arrays.asList(
                new MonHoc("1", "Kiến trúc máy tính", 3),
                new MonHoc("2", "Thiết kế web", 2)
        ));

        duyetMonHoc(ls.iterator());
    }
}
