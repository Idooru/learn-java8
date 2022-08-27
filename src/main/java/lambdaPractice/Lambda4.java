package lambdaPractice;

public class Lambda4 {
    public static void main(String[] args) {
        Runnable lambda4 = () -> System.out.println("lambda4");

        lambda4.run();
    }
}
