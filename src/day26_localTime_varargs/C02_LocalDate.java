package day26_localTime_varargs;

import java.time.LocalDate;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        System.out.println(tarih); // 2023-03-21

        System.out.println(tarih.isLeapYear()); // false

        LocalDate tarih2= LocalDate.of(2222,10,10);

        System.out.println(tarih2.isLeapYear()); // false // isLeapYear() methodu bize artık yılı verir

        System.out.println(tarih.plusWeeks(20).plusDays(2)); // 2023-08-10

        System.out.println(tarih.minusMonths(3).minusDays(3)); // 2022-12-18

        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-21

        System.out.println(tarih.getDayOfYear()); // bugün yılın 80. günüymüş

        System.out.println(tarih.getMonth()); // MARCH // bulunduğumuz ayı veren method

        System.out.println(tarih.getMonthValue()); // 3 / bulunduğumuz ayın kaçıncı ay olduğunu veren method

        System.out.println(tarih.getDayOfWeek()); // TUESDAY // seçtiğimiz tarihteki günü veren method

        System.out.println(tarih.isAfter(tarih2)); // false
        System.out.println(tarih.isBefore(tarih2)); // true


    }
}
