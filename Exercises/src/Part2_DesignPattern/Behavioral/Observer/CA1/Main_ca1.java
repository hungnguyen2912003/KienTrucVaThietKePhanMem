package Part2_DesignPattern.Behavioral.Observer.CA1;

import java.util.List;

public class Main_ca1 {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        //Phải bắt buộc gọi
//        MyClient client = new MyClient(stream);
        MyClientGeneric<List<MonHoc>> client = new MyClientGeneric<>(stream, monHocs -> {
            for(MonHoc monHoc : monHocs){
                System.out.println(monHoc.toString());
            }
        });
        System.out.println("Lần 1");
        dataAccess.add(new MonHoc("001", "Lập trình Android", 3));
        System.out.println("Lần 2");
        dataAccess.add(new MonHoc("002", "Tư tưởng Hồ Chí Minh", 2));
        System.out.println("Lần 3");
        dataAccess.add(new MonHoc("003", "Thể chất", 1));
        System.out.println("Lần 4");
        dataAccess.xoaMonHoc("002");
        System.out.println("Lần 5");
        dataAccess.xoaMonHoc("003");
    }
}
