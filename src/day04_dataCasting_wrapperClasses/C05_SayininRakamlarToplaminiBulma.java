package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        //Kullanıcıdan 3 basamaklı bir sayı alın
        // ve sayının rakamlar toplamını yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı bir sayı giriniz : ");

        int girilenSayi= scan.nextInt(); //135 olsun girilen rakam

        int rakam = girilenSayi % 10;

        girilenSayi= girilenSayi / 10;

        int rakam2= girilenSayi % 10;

        girilenSayi= girilenSayi / 10;

        int rakam3= girilenSayi % 10;

        int toplam = rakam+rakam2+rakam3;

        System.out.println("Girilen 3 basamaklı sayının rakamları toplamı : "+ toplam );







    }
}
