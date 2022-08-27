package lambda;

public class B006 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = (int a) -> a * a;

        int b = mfi.runSomething(3);

        System.out.println(b);
    }
}
