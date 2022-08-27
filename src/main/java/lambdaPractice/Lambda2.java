package lambdaPractice;

public class Lambda2 {
    public static void main(String[] args) {
        Runnable lambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("lambda2");
            }
        };

        lambda.run();
    }
}
