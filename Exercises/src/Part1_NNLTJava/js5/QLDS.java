package Part1_NNLTJava.js5;

import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS{

    public List<CaNhan> ds = new ArrayList<>();
    @Override
    public int them(CaNhan caNhan) {
        ds.add(caNhan);
        return ds.size();
    }

    @Override
    public int xoa(String ten) {
        ds.removeIf(caNhan -> caNhan.hoTen.equals(ten));
        return ds.size();
    }

    @Override
    public void inDS() {
        for (CaNhan caNhan : ds){
            System.out.println(caNhan.HienThiTT());
        }
    }
}
