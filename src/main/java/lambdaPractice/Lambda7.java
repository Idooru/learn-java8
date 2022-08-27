package lambdaPractice;

public class Lambda7 {
    public static void main(String[] args) {
        MyLambdaInterface mli = (a, b) -> a + b;

        sum(mli);
    }

    public static void sum(MyLambdaInterface mli) {
        System.out.println(mli.sum(3, 1));
    }
}
