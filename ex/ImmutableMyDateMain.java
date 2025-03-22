package lang.immutable.ex;

import java.util.Date;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate d1 = new ImmutableMyDate(2025, 1, 13);
        ImmutableMyDate d2 = d1;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        System.out.println("2025 -> d1");
        d2 = d2.withDay(15);
        d2 = d2.withMonth(5);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
