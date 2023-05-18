package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen çemberin yarı çapını giriniz");

        double yaricap= scan.nextDouble();

        System.out.println("Çemberin çevresi: " + 2 * 3.14 * yaricap );

        System.out.println("Dairenin alanı: "+ 3.14 * yaricap * yaricap);



    }
}
