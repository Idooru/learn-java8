package lambda;

import java.util.Arrays;

public class B013 {
    public static void main(String[] args) {
        int[] ages = {20, 15, 23, 18, 30, 32, 12, 14, 24, 16};
        String[] ch = {"a", "b", "c", "d", "e"};

        Arrays.stream(ages).filter((idx) -> idx < 20).forEach((idx) -> System.out.printf("Age %d!!! Can't enter\n", idx));
        Arrays.stream(ch).filter((idx) -> !idx.equals("c")).forEach((idx) -> System.out.format("%s는 c가 아닙니다.\n", idx));

        Object obj = new Object();

    }
}
