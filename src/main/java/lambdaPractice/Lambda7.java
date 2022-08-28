package lambdaPractice;

public class Lambda7 {
    public static void main(String[] args) {
        MySumLambdaInterface mli = (a, b) -> a + b;

        sum(mli);
    }

    public static void sum(MySumLambdaInterface mli) {
        System.out.println(mli.sum(3, 1));
    }
}
