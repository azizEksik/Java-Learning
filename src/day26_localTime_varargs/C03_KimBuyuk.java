package day26_localTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {

    public static void main(String[] args) {

        // kullanıcıdan iki farklı kişinin isim ve doğum tarihinin gün, ay ve yilini alıp
        // hangi tarihte doğan kişinin daha büyük olduğunu yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim1= scan.nextLine();
        System.out.println("doğduğunuz günü giriniz");
        int gun1= scan.nextInt();
        System.out.println("doğduğunuz ayı giriniz");
        int ay1= scan.nextInt();
        System.out.println("doğduğunuz yılı giriniz");
        int yil1= scan.nextInt();

        LocalDate  tarih1= LocalDate.of(yil1,ay1,gun1);

        Scanner scan1=new Scanner(System.in);

        System.out.println("isminizi giriniz");
        String isim2= scan1.nextLine();
        System.out.println("doğduğunuz günü giriniz");
        int gun2= scan1.nextInt();
        System.out.println("doğduğunuz ayı giriniz");
        int ay2= scan1.nextInt();
        System.out.println("doğduğunuz yılı giriniz");
        int yil2= scan1.nextInt();


        LocalDate  tarih2= LocalDate.of(yil2,ay2,gun2);

        if (tarih1.isBefore(tarih2)){
            System.out.println(isim1+ " büyütür " +isim2);
        }else {
            System.out.println(isim2+ " büyütür " +isim1);
        }

    }
}
