package behavioral.Observer.TiGia;

import java.util.ArrayList;
import java.util.List;

public abstract class TiGia {
    List<TiGiaObserver> observers = new ArrayList<TiGiaObserver>();

    public void attach(TiGiaObserver observer){
        observers.add(observer);
    }

    public void detach(TiGiaObserver observer){
        observers.remove(observer);
    }

    abstract public void notify(double delta);

    public static interface TiGiaObserver {
       public void tigiaChanged(double delta);
    }
}
