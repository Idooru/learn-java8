package lambdaPractice;

public class Lambda5 {
    public static void main(String[] args) {
        MySumLambdaInterface mli = (a, b) -> {
            return a + b;
        };

        System.out.println(mli.sum(2, 3));
    }
}