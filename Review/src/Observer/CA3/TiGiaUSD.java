package Observer.CA3;

public class TiGiaUSD extends TiGia{
    @Override
    void Notify(double delta) {
        for(TiGiaObserver tg : observers){
            tg.update(delta);
        }
    }
}
