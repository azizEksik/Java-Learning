package day10_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {


        String str= "Java cok ama cok guzel";

        System.out.println(str.indexOf("c")); // 5

        System.out.println(str.indexOf("a")); // 1 // birden fazla ise ilk bulduğunu verir

        System.out.println(str.indexOf("cok")); // 5 // "cok"u bir paket yapıp ilk index'ini söyler yani "c"nin

        System.out.println(str.indexOf("cok", 6)); // 13

        System.out.println(str.indexOf("cok", 5)); // 5

        System.out.println(str.indexOf("java")); // -1 aranan  string -1 döner

        System.out.println("==========================");

        // soru- verilen bir cümlede, istenen bir string için
        //       aşağıdaki cümlelerden uygun olanı yazdırın
        //       1- aradığınız kelime cümlede 1 kere  kullanılmış
        //       2- aradığınız kelime cümlede 2 kere kullanılmış
        //       3- aradığınız  kelime cümlede 2'den fazla kullanılmış
        //       4- aradığınız kelim cümlede hiç kullanılmamıştır



        String cumle="Yasasin java, iyi ki java ogreniyorum";

        String kelime="java";

        if (cumle.indexOf(kelime) == (-1)){
            System.out.println("aradığınız kelim cümlede hiç kullanılmamıştır");
        }else {
            int  indexkelime= cumle.indexOf(kelime);
            if (cumle.indexOf(kelime,(indexkelime+1))==(-1)){
                System.out.println("aradığınız kelime cümlede 1 kere  kullanılmış");
            }else {
                int indexkelime2= cumle.indexOf(kelime,(indexkelime+1));
                if (cumle.indexOf(kelime,(indexkelime2+1))==(-1)){
                    System.out.println("aradığınız kelime cümlede 2 kere kullanılmış");
                }else {
                    System.out.println("aradığınız  kelime cümlede 2'den fazla kullanılmış");
                }
            }
        }





    }
}
