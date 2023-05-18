package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C02_asciiTableSoruları {
    public static void main(String[] args) {

        //soru: Kullanicidan bir harf alin ve o harften sonraki 3 harfi yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lürfen bir harf giriniz");

       char girilenHarf= scan.next().charAt(0);

        System.out.println("Girilen harften sonraki 3 harf : " + (char)(girilenHarf+1) + ", " +
                (char)(girilenHarf+2) + ", " + (char)(girilenHarf+3));




    }
}
