package Observer.CA3;

public class NhaDauTuA implements TiGiaObserver{

    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
    }

    public void dangKy(){
        t.Attach(this);
    }

    public void huyDangKy(){
        t.Detach(this);
    }

    @Override
    public void update(double delta) {
        if(delta < 0)
        {
            System.out.println("Nhà đầu tư A: Mua vào");
        }
        else{
            System.out.println("Nhà đầu tư B: Bán ra");
        }
    }
}
