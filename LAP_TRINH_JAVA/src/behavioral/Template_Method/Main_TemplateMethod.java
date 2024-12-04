package behavioral.Template_Method;

public class Main_TemplateMethod {
    public static void main(String[] args) {
        CaffeineBeverage cf = new Coffee();
        System.out.println("Công thức pha cà phê");
        cf.prepareRecipe();
        System.out.println("Công thức pha trà");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
