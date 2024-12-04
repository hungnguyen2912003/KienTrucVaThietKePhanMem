package Part2_DesignPattern.Behavioral.Observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess extends MyStream{
    private List<MonHoc> dsmh = new ArrayList<MonHoc>();

    private MyStream<List<MonHoc>> myStream;

    public DataAccess(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
    }

    void add(MonHoc mh) {
        dsmh.add(mh);
        myStream.addEvent(dsmh);
    }

    void xoaMonHoc(String maMH) {
        MonHoc m = null;
        for (MonHoc mh : dsmh) {
            if(mh.maMonHoc.equals(maMH)){
                m = mh;
                break;
            }
        }
        if(m != null){
            dsmh.remove(m);
            myStream.addEvent(dsmh);
        }
    }
}
