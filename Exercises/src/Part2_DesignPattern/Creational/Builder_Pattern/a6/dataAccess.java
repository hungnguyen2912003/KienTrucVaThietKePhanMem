package Part2_DesignPattern.Creational.Builder_Pattern.a6;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private static dataAccess instance;
    private List<SanPham> lssp = new ArrayList<>();

    public static dataAccess getInstance() {
        if(instance == null)
            instance = new dataAccess();
        return instance;
    }

    public void Add(SanPham sp){
        for(SanPham sanPham : lssp)
        {
            if(sanPham.MaSanPham.equals(sp.MaSanPham))
                return;
        }
        lssp.add(sp);
    }

    public void Del(String maSP){
        if(lssp.removeIf(sanPham -> sanPham.MaSanPham.equals(maSP))) {
            System.out.println("Xóa sản phẩm " + maSP + " thành công");
        }
        else{
            System.out.println("Không tìm thấy " + maSP);
        }
    }

    public void Update(SanPham sp){
        for(int i = 0; i < lssp.size(); i++){
            if(lssp.get(i).MaSanPham.equals(sp.MaSanPham)){
                lssp.set(i, sp);
                System.out.println("Cập nhật sản phẩm có mã " + sp.MaSanPham + " thành công");
                break;
            }
            else{
                System.out.println("Không tìm thấy sản phẩm " + sp.MaSanPham);
            }
        }
    }
}
