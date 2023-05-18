package day07_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        //soru- kullanicidan pozitif bir tamsayı alın
        //sayı 3 ile bölünebiliyorsa "3'ün katı"
        //sayı 5 ile bölünebiliyorsa "5'in katı"
        // sayı hem 3 hem de 5 ile bölünebiliyorsa "3 ve 5'in katı" yazdırın
        //ikisine de bölünemiyorsa " ne 3'ün  ne de 5'in katı" yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayı giriniz : ");

        int sayi= scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("Girilen sayı hem üçün hem de beşin katı");
        } else if (sayi%3==0) {
            System.out.println("Girilen sayı üçün katı");

        } else if (sayi%5==0) {
            System.out.println("Girilen sayı beşin katı");

        }else {
            System.out.println("Girilen sayı ne üçün katı ne de beşin katı");
        }

    }
}
