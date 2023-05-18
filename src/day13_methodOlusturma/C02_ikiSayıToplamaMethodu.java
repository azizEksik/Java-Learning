package day13_methodOlusturma;

import java.util.Scanner;

public class C02_ikiSayıToplamaMethodu {

    public static void main(String[] args) {

        // kullanıcıdan iki sayı alıp toplamlarını yazdıran bir method oluşturun

        ikiSayiTopla();

    }

    public static void ikiSayiTopla(){

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen toplamak istediğiniz iki sayıyı giriniz");

        double  sayi1= scan.nextDouble();
        double  sayi2= scan.nextDouble();

        System.out.println("Girilen sayıların toplamı  : " + (sayi1+sayi2));

    }
}
