package behavioral.Template_Method;

public abstract class CaffeineBeverage {

    abstract void brew();
    abstract void addCondiments();

    private void boilWater(){
        System.out.println("Đun sôi nước");
    }

    private void pourInCup(){
        System.out.println("Rót ra cốc");
    }

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
