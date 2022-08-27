package lambda;

public class B005 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = (int a) -> {
            return a * a;
        };

        int result = mfi.runSomething(3);
        System.out.println(result);
    }
}

