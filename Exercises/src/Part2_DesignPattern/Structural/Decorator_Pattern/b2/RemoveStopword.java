package Part2_DesignPattern.Structural.Decorator_Pattern.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopword extends TokenDecorator{

    ArrayList<String> stopwords;
    public RemoveStopword(Tokenize token) {
        super(token);
        stopwords = new ArrayList<String>(Arrays.asList("và", "hoặc", "thì", "mà", "là"));
    }

    @Override
    public List<String> tokenize() {
        List<String> result = token.tokenize();
        result.removeAll(stopwords);
        return result;
    }
}
