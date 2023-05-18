package day26_localTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt); // 2023-03-21T10:42:21.123119200

        System.out.println(ldt.toLocalDate()); // 2023-03-21
    }
}
