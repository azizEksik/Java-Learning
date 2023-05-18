package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        //soru- Kullanıcıdan cinsiyetini ve yaşını alın, kadın, 60 yaş ve üzeri
        //erkek 65 yaş ve üzeri emekli olabilir
        //cinsiyet ve yaşını dikkate alarak "emekli olabilirsin"
        // veya "emekli olmak için... yıl daha çalışman gerekli" yazdırın
        // hatalı giriş yapılırsa kullanıcıyı uyarın

        /*
        Bu defa ana değişken yaş olsun
         */


        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");

        double yas= scan.nextDouble();

        System.out.println("Lütfen cinseyitinizi giriniz" + "\nKadın için : K, Erkek için : E yazınız");

        char cinsiyet=scan.next().charAt(0);

        if (yas<16 || yas>80){

            System.out.println("Geçersiz yaş girdiniz, lütfen tekrar deneyiniz");

        } else if (yas<60) {

            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olabilmeniz için " + (60-yas) + "yıl daha çalışmalısınız");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olabilmeniz için " + (65-yas) + "yıl daha çalışmalısınız");
            }else {
                System.out.println("Geçersiz cinsiyet");
            }

        } else if (yas<65) {
            if (cinsiyet=='k' || cinsiyet=='K'){
                System.out.println("Emekli olabilirsiniz");
            } else if (cinsiyet=='e' || cinsiyet=='E') {
                System.out.println("Emekli olabilmeniz için " + (65-yas) + "yıl daha çalışmalısınız");
            }else {
                System.out.println("Geçersiz cinsiyet");
        }

        }else {
            if (cinsiyet=='e' || cinsiyet=='E'){
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet=='k' || cinsiyet=='K') {
                System.out.println("Emekli olabilirsin");

            }else {
                System.out.println("Geçersiz cinsiyet");
            }
        }

    }
}
