package day08_nestedIfElse_ternary;

import java.util.Locale;
import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        //saru- Kullanıcıdan bir tam sayı isteyin,
        //sayıyı kontrol edip 5 ile bölünebiliyorsa
        //"Sayı 5'in tam katı" yazdırın

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");

        int sayi= scan.nextInt();

        System.out.println(sayi%5==0 ? "Sayı 5'in tam katı" : "Sayı 5 in tam katı değil");

         */

        //soru- Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        // üçgen eşkenar ise "Eşkenar üçgen" yazdırın
        // değilse "Eşkenar üçgen değil" yazdırın

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir üçgenin 3 kenar uzunluğunu da yazınız");

        double kn1= scan.nextDouble();
        double kn2= scan.nextDouble();
        double kn3= scan.nextDouble();

        System.out.println(kn1==kn2 &&  kn1==kn3 ? "Eşkenar üçgen" : "Eşkenar üçgen değil");

         */

        //soru- Kullanicidan bir harf isteyin
        //girilen karakter küçük har ise onu büyük harf olarak yazdırın
        //değilse girilen harfi  yazdırın

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz");

        char hrf= scan.next().charAt(0);

        System.out.println(hrf>='a' && hrf<='z' ? Character.toUpperCase(hrf) : hrf);

         */

        //soru- kullanıcıdan iki sayı alın ve büyük olmayan sayıyı yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iki adet sayı giriniz");

        double sy1= scan.nextDouble();
        double sy2= scan.nextDouble();

        System.out.println(sy1>sy2 ? sy1 : sy2);


    }
}
