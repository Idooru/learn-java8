package lambda;

import java.util.function.*;

public class B010 {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("hello");
        Supplier<Integer> sup = () -> 3 * 3;
        Consumer<Integer> con = num -> System.out.println(num);
        Function<Integer, String> fun = num -> "input: " + num;
        Predicate<Integer> pre = num -> num > 10;
        UnaryOperator<Integer> uOp = num -> num * num;


    }
}
