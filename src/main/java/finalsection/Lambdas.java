package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        // case1
        Function<String, String> f = value -> "";

        // case2
        BiFunction<String,Integer,String> f2 = (name,age) -> "";

        // case3
        BiFunction<String,Integer,String> f3 = (name,age) -> {
            //logic
            return "";
        };
    }
}
