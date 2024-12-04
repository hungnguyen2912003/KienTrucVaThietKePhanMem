package Part1_NNLTJava.js5;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {

    QLDS dshs = new QLDS();
    QLDS dsgv = new QLDS();
    public int themHocSinh(HocSinh hs){
        dshs.them(hs);
        return dshs.ds.size();
    }

    public int themGVGD(GiaoVien gv){
        dsgv.them(gv);
        return dsgv.ds.size();
    }

    public void inDSHS(){
        dshs.inDS();
    }

    public void inDSGVGD(){
        dsgv.inDS();
    }
}
