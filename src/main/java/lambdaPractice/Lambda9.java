package lambdaPractice;

public class Lambda9 {
    public static void main(String[] args) {
        System.out.println(sum().sum(1, 2));
    }

    public static MyLambdaInterface sum() {
        return (a, b) -> a + b;
    }
}
