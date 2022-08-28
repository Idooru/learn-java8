package lambdaPractice;

public class Lambda11 {
    public static void main(String[] args) {
        PrintAble pa = () -> {
            System.out.println("Hello");
        };

        pa.print();
    }
}
