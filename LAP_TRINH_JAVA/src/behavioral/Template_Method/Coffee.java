package behavioral.Template_Method;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Cho bột coffee vào phin và cho thêm nước sôi vào");
    }

    @Override
    void addCondiments() {
        System.out.println("Cho thêm một ít sữa đặc vào cốc");
    }
}
