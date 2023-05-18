package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C09_SwitchStatements {
    public static void main(String[] args) {


        //Soru- Kullanıcıdan bir harf isteyin
        //o harfle başlayan gün ismi varsa yazdırın
        //yoksa geçersiz harf yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz");

        char hrf=scan.next().charAt(0);

        hrf=Character.toUpperCase(hrf);
        
        if (hrf== 'P'){
            System.out.println("Pazartesi , Pazar veya Perşembe");
        } else if (hrf== 'S') {
            System.out.println("Salı");
            
        } else if (hrf== 'Ç') {
            System.out.println("Çarşamba");
            
        } else if (hrf== 'C') {
            System.out.println("Cuma veya Cumartesi");
            
        }else {
            System.out.println("Geçersiz harf");
        }

        System.out.println("=====================");

        //daha düzenli ve kullanışlı olarak switch statemens kullanabiliriz
        // switch statements , switch önünde yazılan değişkene eşit olan case'i çalıştırır
        // çalışmaya başladıktan sonra
        // break görünceye kadar veya switch'in sonuna kadar çalışır

        switch (hrf){

            case 'P' :
                System.out.println("Pazartesi , Pazar veya Perşembe");
                break;

            case 'S' :
                System.out.println("Salı");
                break;

            case 'Ç' :
                System.out.println("Çarşamba");
                break;

            case 'C' :
                System.out.println("Cuma veya Cumartesi");
                break;

            default:
                System.out.println("Geçersiz harf");
        }

    }
}
