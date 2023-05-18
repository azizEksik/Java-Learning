package day07_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {

        //soru- Kullanıcıdan cinsiyetini ve yaşını alın, kadın, 60 yaş ve üzeri
        //erkek 65 yaş ve üzeri emekli olabilir
        //cinsiyet ve yaşını dikkate alarak "emekli olabilirsin"
        // veya "emekli olmak için... yıl daha çalışman gerekli" yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");

        double yas= scan.nextDouble();

        System.out.println("Lütfen cinsiyetinizi giriniz..." + "\nKadın için : K, Erkek için : E giriniz");

        char cn1= scan.next().charAt(0);

        if ((cn1 == 'K' && yas>=60) || (cn1 == 'E' && yas>=65)){
            System.out.println("Emekli olabilirsin");
        } else if (cn1 == 'K' && yas<60) {
            System.out.println("Emekli olman için " + (60-yas) + "  yıl çalışman  gerek");
            
        } else if (cn1 == 'E' && yas<65) {
            System.out.println("Emekli olma için " + (65-yas) + " yıl çalışman gerek");

        }


    }
}
