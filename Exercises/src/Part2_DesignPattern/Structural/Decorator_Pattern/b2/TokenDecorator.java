package Part2_DesignPattern.Structural.Decorator_Pattern.b2;

public abstract class TokenDecorator implements Tokenize{

    Tokenize token;

    public TokenDecorator(Tokenize token) {
        this.token = token;
    }
}
