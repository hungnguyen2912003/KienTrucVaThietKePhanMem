package Observer.CA3;

import java.util.ArrayList;
import java.util.List;

public abstract class TiGia {
    List<TiGiaObserver> observers = new ArrayList<TiGiaObserver>();

    public void Attach(TiGiaObserver observer) {
        observers.add(observer);
    }

    public void Detach(TiGiaObserver observer) {
        observers.remove(observer);
    }

    abstract void Notify(double delta);
}
