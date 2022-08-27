package lambda;

public class B008 {
    public static void main(String[] args) {
        doIt(a -> a * a);
    }

    public static void doIt(MyFunctionalInterface mfi) {
        System.out.println(mfi.runSomething(3));
    }

}
