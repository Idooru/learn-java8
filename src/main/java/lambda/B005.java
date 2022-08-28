package lambda;

public class B005 {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = (int a) -> {
            return a * a;
        };

        int result = mfi.runSomething(3);
        System.out.println(result);

        System.out.println(mfi2.runSomething(4));
    }

    static MyFunctionalInterface mfi2 = (int a) -> {
        return a * a;
    };
}

