package lambdaPractice;

public class Lambda3 {
    public static void main(String[] args) {
        Runnable lambda = () -> {
            System.out.println("lambda3");
        };

        lambda.run();
    }
}
