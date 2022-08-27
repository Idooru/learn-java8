package lambdaPractice;

public class Lambda1 {
    public static void main(String[] args) {
        Test ts = new Test();
        var lambda = (Runnable) ts;
        lambda.run();
    }
}

class Test implements Runnable {
    @Override
    public void run() {
        System.out.println("lambda1");
    }
}