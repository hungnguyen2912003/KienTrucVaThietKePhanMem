package behavioral.Template_Method;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Cho túi trà vào cốc và đổ nước sôi vào");
    }

    @Override
    void addCondiments() {
        System.out.println("Cho thêm chanh vào ly");
    }
}
