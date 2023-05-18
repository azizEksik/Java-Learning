package day04_dataCasting_wrapperClasses;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        /*

        24 ==> 11000
         a ==> 97 ==> 10100010
         b ==> 98

         ahmet
         Ascii table harflerin 1 ve 0 lara dönusturulmesi icin
         harlere atanan sayilardir

         */


        /*
         char data turundeki vaiable ve degerler
         sayisal data turune atanirsa veya
         sayisal data turundeki datalarla isleme sokulursa
         ASCII table'daki degerleri ile isleme girer

         */

        System.out.println( 5 + 'a'); // 5 + 97 = 102

        char ilkHarf= 101;

        System.out.println(ilkHarf); // e yazdirir

        // kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar= 'f';


        System.out.println(girilenChar + 1); // 102 + 1 = 103

        //biz 103'u degil , 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz

        System.out.println("Girilen harfin bir sonrası : " + (char)(girilenChar+1));

        //verilen harften 2 önceki harfi yazdirin

        girilenChar= 'M';

        System.out.println(girilenChar - 2);

        System.out.println("Verilen harften önceki 2 harf :" + (char)(girilenChar - 2)); // k

        char a=106;
        System.out.println((char)(a-2));





    }
}
