package lambdaPractice;

public class Lambda6 {
    public static void main(String[] args) {
        MySumLambdaInterface mli = (a, b) -> a + b;

        System.out.println(mli.sum(3, 7));
    }
}
