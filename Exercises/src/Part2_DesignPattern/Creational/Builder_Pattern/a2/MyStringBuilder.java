package Part2_DesignPattern.Creational.Builder_Pattern.a2;

public class MyStringBuilder {
    String str;

    public MyStringBuilder(){
        this.str = "";
    }

    public MyStringBuilder addString(String s){
        this.str += s;
        return this;
    }

    public MyStringBuilder addFloat(float f){
        this.str += f;
        return this;
    }

    public MyStringBuilder addBool(boolean b){
        this.str += b;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
}
