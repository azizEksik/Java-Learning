package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        //soru- Kullanıcıdan cinsiyetini ve yaşını alın, kadın, 60 yaş ve üzeri
        //erkek 65 yaş ve üzeri emekli olabilir
        //cinsiyet ve yaşını dikkate alarak "emekli olabilirsin"
        // veya "emekli olmak için... yıl daha çalışman gerekli" yazdırın
        // hatalı giriş yapılırsa kullanıcıyı uyarın


        /*
        birden fazla değişkene bağlı if else statement'larını yazarken
        önce değişkenlerden birine göre ana yapıyı oluşturalım
         */

        /*
        bu soruda cinsiyeti ana değişken yapalım
        2. değişkeni ana değişkenin her bölümünde ayri ayri değerlendirelim
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");

        double yas= scan.nextDouble();

        System.out.println("Lütfen cinsiyetinizi giriniz..." + "\nKadın için : K, Erkek için : E giriniz");

        char cinsiyet= scan.next().charAt(0);

        if (cinsiyet=='k' || cinsiyet=='K'){

            if (yas<16 || yas>80){
                System.out.println("Geçersiz yaş girişi, lütfen tekrar deneyiniz");
            } else if (yas<60) {
                System.out.println("Emekli olmak için " + (60-yas) + "Yıl çalışmalısınız" );
            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet=='e' || cinsiyet=='E') {

            if (yas<16 || yas>80){
                System.out.println("Geçersiz yaş girişi, lütfen tekrar deneyiniz");
            } else if (yas<65) {
                System.out.println("Emekli olmak için " + (65-yas) + "Yıl çalışmalısınız" );
            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        }else {
            System.out.println("Geçersiz cinsiyet girişi, lütfen yeniden deneyiniz");
        }


    }
}
