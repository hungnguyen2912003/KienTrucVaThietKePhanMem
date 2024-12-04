package behavioral.Observer.TiGia;

public class TiGiaUSD extends TiGia{
    @Override
    public void notify(double delta) {
        for(TiGiaObserver observer : observers){
            observer.tigiaChanged(delta);
        }
    }
}
