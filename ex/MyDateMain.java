package lang.immutable.ex;

import java.util.Date;

public class MyDateMain {

    public static void main(String[] args) {
        Date d1 = new Date(2025, 1, 13);
        Date d2 = d1;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        System.out.println("2025 -> d1");
        d1.setYear(2025);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}
