package day09_switch_stringManipulation;

import java.util.Scanner;

public class C01_switch {
    public static void main(String[] args) {

        //soru- kullanıcıdan bir rakam alıp rakamı yazıyla ayzdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir rakam giriniz");

        int rakam= scan.nextInt();

        switch (rakam){

            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Lütfen rakam giriniz");



        }

    }
}
