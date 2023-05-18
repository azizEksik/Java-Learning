package day06_bagimzsizIfCumleleri;

import java.util.Scanner;

public class C02_IfStatementsSorular {

    public static void main(String[] args) {

        //Kullanicidan bir tam sayi isteyin sayiyi kontrol edip 5 ile bölünebiliyorsa
        //sayi 5'in tam katı yazdırın

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı yazınız");

        int sayi= scan.nextInt();

        if (sayi%5==0){
            System.out.println("Sayı 5'in tam katı");
        }
        if (sayi%5!=0){
            System.out.println("Sayi 5'in tam katı değildir");
        }

         */



        //Kullanicidan bir sayi alin, Sayi 3 ile bölüne biliyorsa
        //"Üç ile bölünebilen sayi",
        //5 ile bölünebiliyorsa "Beş ile bölünebilen sayi" yazdirin

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayı yazınınz");

        int sayi= scan.nextInt();

        if (sayi%3==0){
            System.out.println("Üç ile bölünebilen sayı");
        }
        if (sayi%5==0){
            System.out.println("Beş ile  bölünebilen sayı");
        }

         */


        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alın
        //ucgen eskenar ise "Eskenar ucgen" yazdirin
        /*
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen birinci kenarın uzunlugunu giriniz");

        double kenar1= scan.nextDouble();

        System.out.println("lütfen ikinci kenarın uzunluğunu giriniz");

        double kenar2= scan.nextDouble();

        System.out.println("lütfen üçüncü kenarın uzunluğunu giriniz");

        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eşkenar üçgen");
        }

         */
        /*
        Javada 3'lü karşılaştırma yoktur
        onun yerine ikili karşılaştırmalar yapıp && ile birleştirebiliriz
         */

        //Kullanicidan notunu alin 50 veya  daha buyukse "Sınıfı geçtin"
        //50'den kucukse "Malesef kaldın" yazdırın

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not1= scan.nextDouble();

        if (not1>=50 && not<=100){
            System.out.println("Sınıfı geçtiniz");
        }

        if (not1<50){
            System.out.println("Malesef kaldınız");
        }

         */




    }

}
