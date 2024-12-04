package Part2_DesignPattern.Creational.Builder_Pattern.a6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> instances = new Hashtable<>();

    private List<SanPham> lssp = new ArrayList<>();

    public static DataAccessUpgrade getInstance(String tag) {
        if(instances.get(tag) == null){
            DataAccessUpgrade d = new DataAccessUpgrade();
            instances.put(tag,d);
        }
        return instances.get(tag);
    }

    public void Add(SanPham s){
        lssp.add(s);
    }

    public void inDS() {
        for(SanPham sp : lssp)
            System.out.println(sp.toString());
    }

}
