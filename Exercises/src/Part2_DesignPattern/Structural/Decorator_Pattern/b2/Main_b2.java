package Part2_DesignPattern.Structural.Decorator_Pattern.b2;

public class Main_b2 {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên được nghỉ lễ 30 tháng 4, ở nhà hoặc đi chơi";
        Tokenize t = new TachTu(s);
        //Chuỗi ban đầu
        System.out.println(t.tokenize());
        t = new RemoveStopword(t);
        //Chuỗi tách từ dừng
        System.out.println(t.tokenize());
        t= new RemovePunc(t);
        //Chuỗi tách dấu
        System.out.println(t.tokenize());
    }
}
