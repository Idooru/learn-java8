package lambdaPractice;

public class Lambda8 {
    public static void main(String[] args) {
        sum((a, b) -> a + b);
    }

    private static void sum(MySumLambdaInterface mli) {
        System.out.println(mli.sum(7, 2));
    }
}
