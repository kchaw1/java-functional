package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * javadoc
 * Function<T> : Represents a function that accepts one argument and produces a result.
 * BiFUnction<T,U> : Represents a function that accepts two arguments and produces a result.
 */
public class _Function {
    public static void main(String[] args) {
        // Function takes 1 argument and prooduces 1 result
        // step 1
        int increment = incrementByOne(1);
        System.out.println(increment);

        // step 2
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // step 3
        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        // step 4
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // BiFunction takes 2 argument and produces 1 result
        // step 5
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );

        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        );
    }

    static Function<Integer /*input*/, Integer/*output*/> incrementByOneFunction = number -> number+1;
    static Function<Integer, Integer> multipleBy10Function = number -> number*10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    // 2 arguments
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
