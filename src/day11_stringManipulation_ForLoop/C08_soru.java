package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class C08_soru {
    public static void main(String[] args) {

        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz");

        String ad=scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz");

        String soyad= scan.nextLine();

        if (ad.length()>soyad.length()){
            System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1,ad.length())+
                    " " + soyad.toUpperCase().charAt(0) + soyad.substring(1,soyad.length()) );
        }else if(soyad.length()>ad.length()) {
            System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1,ad.length())+
                    " " + soyad.toUpperCase());
        }else {
            System.out.println("isimle soy isim eşit olamaz");
        }


    }

}
