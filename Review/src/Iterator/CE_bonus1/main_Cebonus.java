package Iterator.CE_bonus1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class main_Cebonus {

    static void duyetNk(Iterator<NhatKy> iterator){
        while(iterator.hasNext()){
            NhatKy nhatKy = iterator.next();
            System.out.println(nhatKy.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<NhatKy> nhatKyArrayList = new ArrayList<>(Arrays.asList(
                new NhatKy("Con vịt vàng", "Con vịt trong hồ bơi"),
                new NhatKy("Ngôi nhà nhỏ", "Ngôi nhà hạnh phúc"),
                new NhatKy("Đi học thôi", "Mỗi ngày đi học"),
                new NhatKy("Em bé ngoan", "Em bé đang ngủ")
        ));

        duyetNk(nhatKyArrayList.iterator());
    }
}
