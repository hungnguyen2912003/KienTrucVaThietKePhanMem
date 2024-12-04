package Part2_DesignPattern.Structural.Decorator_Pattern.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePunc extends TokenDecorator{


    public RemovePunc(Tokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> result = token.tokenize();

        result.replaceAll(s -> {return s.replaceAll("\\p{Punct}", "");});

        return result;
    }
}
