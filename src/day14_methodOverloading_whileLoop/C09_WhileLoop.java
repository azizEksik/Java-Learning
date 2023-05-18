package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan bir şifre isteyin
        // asagıdaki şartları saglayana kadar,
        // her seferinde hataları söyleyip yeni şifre isteyin
        // şartları sağlayan şifre olduğunda
        // "şu kadar denemenizde başarılı şifre oluşturuldu" şeklinde açıklama  yazın
        // - ilk harf kucuk harf  olmalı
        // - son harf büyük harf olmalı
        // - boşluk içermemeli
        // - 8 karakter veya daha uzun olmalı

        Scanner scan=new Scanner(System.in);

        String girilensifere="";
        int girilensifreadedi=0;
        int flag=0;

        while (flag!=4){

            flag=0;

            System.out.println("Lütfen bir şifre giriniz");

            girilensifere=scan.nextLine();


            if (girilensifere.charAt(0)>='a' && girilensifere.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("ilk harf küçük harf olmalı");
            }
            if (girilensifere.charAt(girilensifere.length()-1)>='A'
                    && girilensifere.charAt(girilensifere.length()-1)<='Z'){
                flag++;
            }else {
                System.out.println("Son harf büyük harf olmalı");
            }
            if (!girilensifere.contains(" ")){
                flag++;
            }else {
                System.out.println("Şifre boşluk içermemeli");
            }
            if ((girilensifere.length()-1)>=8){
                flag++;

            }else {
                System.out.println("Şifre 8 karakter veya daha uzun olmalı");
            }
            girilensifreadedi++;

        }

        System.out.println(girilensifreadedi + " denemede şifre başarı ile oluşturuldu");


    }
}
