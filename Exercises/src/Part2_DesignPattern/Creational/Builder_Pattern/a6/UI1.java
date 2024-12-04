package Part2_DesignPattern.Creational.Builder_Pattern.a6;

public class UI1 {

    public void Add(SanPham s, String tag){
        //Lấy một đối tượng trong DataAcessUpgrade
        DataAccessUpgrade d = DataAccessUpgrade.getInstance(tag);
        //Gọi phương thức Add trên đối tượng vừa lấy
        d.Add(s);
    }

    public void InDS(String tag){
        DataAccessUpgrade d = DataAccessUpgrade.getInstance(tag);
        d.inDS();
    }
}
