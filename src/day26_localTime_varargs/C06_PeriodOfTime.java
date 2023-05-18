package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogunTarihi= LocalDate.of(1996,3,3);
        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogunTarihi, bugun)); // P27Y18D // 27 yıl 18 gün

        System.out.println("Yaş : " + Period.between(dogunTarihi,bugun).getYears()); // 27


    }
}
