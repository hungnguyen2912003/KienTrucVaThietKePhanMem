package Part2_DesignPattern.Structural.Decorator_Pattern.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokenize{
    String str;

    public TachTu(String s) {
        this.str = s;
    }

    @Override
    public List<String> tokenize() {

        //Tách từ bởi dấu cách
        String[] tokens = str.split(" ");

        //Cung cấp một tập hợp list
        //asList(T... a): một mảng đặc biệt, từng tham số riêng biệt thành từng mảng.
        ArrayList list = new ArrayList(Arrays.asList(tokens));

        return list;
    }
}
