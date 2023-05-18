package day10_stringManipulation;

import java.util.Scanner;

public class C04_soru {
    public static void main(String[] args) {

        // soru - Kullanıcıdan bir mail alın
        // - mail @ içermiyorsa "geçersiz mail"
        // - mail @gmail.com içermiyorsa, "mail gmail olmalı"
        // - mail @gmail.com ile bitmiyorsa "mailde yazım hatası var" yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen mail adresinizi giriniz");

        String str= scan.nextLine();


        if (!str.contains("@")){

            System.out.println("Geçersiz mail");

        } else if (!str.contains("@gmail.com")) {

            System.out.println("Mail gmail olmalı");

        } else if (!str.endsWith("@gmail.com")) {

            System.out.println("Mailde yazım hatası var");

        }else {
            System.out.println("mail başarı ile kaydedildi");
        }


    }
}
