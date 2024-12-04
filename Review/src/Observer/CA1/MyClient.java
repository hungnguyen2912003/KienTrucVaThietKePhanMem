package Observer.CA1;

import Iterator.CE3.MonHoc;

import java.util.List;

public class MyClient implements MyStream.MyListener<List<MonHoc>>{

    MyStream<List<Observer.CA1.MonHoc>> myStream;

    public MyClient(MyStream<List<Observer.CA1.MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {

    }
}
