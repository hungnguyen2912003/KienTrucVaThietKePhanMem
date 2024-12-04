package Observer.CA1;

import java.util.List;

public class MyStream<T> {

    List<MyListener> listeners;

    public void addListener(MyListener listener) {
        listeners.add(listener);
    }

    public void addEvent(T t){
        for (MyListener l : listeners) {
            l.listen(t);
        }
    }

    public static interface MyListener<T> {
        public void listen(T t);
    }
}
