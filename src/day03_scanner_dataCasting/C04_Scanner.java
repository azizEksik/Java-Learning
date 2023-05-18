package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Sayı1'i giriniz(tam sayı)");

        int Sayi1 = scan.nextInt();

        System.out.println("Sayı2'yi giriniz(tam sayı)");

        int Sayi2 = scan.nextInt();

        int temp = 0;

        temp = Sayi2;

       Sayi2 = Sayi1;

       Sayi1 = temp;


        System.out.println("Sayi1'in yeni değer : " + Sayi1);

        System.out.println("Sayi2'in yeni değer : " + Sayi2);








    }
}
