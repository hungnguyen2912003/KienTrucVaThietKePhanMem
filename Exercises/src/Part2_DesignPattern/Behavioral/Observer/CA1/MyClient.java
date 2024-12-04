package Part2_DesignPattern.Behavioral.Observer.CA1;

import java.util.List;

public class MyClient implements MyStream.MyListener<List<MonHoc>> {

    MyStream<List<MonHoc>> myStream;

    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for (MonHoc mh : monHocs){
            System.out.println("Mã môn học: " + mh.maMonHoc + "\t\tTên môn học: " + mh.tenMonHoc + "\t\t Số tín chỉ: " + mh.soTC);
        }
    }
}
