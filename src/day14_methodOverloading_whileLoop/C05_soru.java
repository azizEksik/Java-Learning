package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {

        //- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz");

        String ad= scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz");

        String soyad=scan.nextLine();

        String sonuc=isimdondurme(ad, soyad);

        System.out.println(sonuc);
    }

    public static String isimdondurme(String isim, String soyisim){



        if ((isim.charAt(0)>='a'&& isim.charAt(0)<='z')
                || (isim.charAt(0)>='A' && isim.charAt(0)<='Z')){
           isim= isim.toUpperCase().charAt(0) +
                   isim.toLowerCase().substring(1,isim.length());

        }
        if ((soyisim.charAt(0)>='a' && soyisim.charAt(0)<='z')
                || (soyisim.charAt(0)>='A' && soyisim.charAt(0)<='Z')){

            soyisim=soyisim.toUpperCase();

        }

        String isimsoysim= isim + " " + soyisim;


        return isimsoysim;


    }

}
