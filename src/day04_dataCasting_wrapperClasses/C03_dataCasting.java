package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir ondalıklı sayı yazın");

        double  girilenDoublesayi= scanner.nextDouble();

        System.out.println("Lütfen bir tam sayı yazın");

        int girilenIntsayi= scanner.nextInt();

        System.out.println("Bölüm işleminin sonucunun tamsayı kısmı : " +(int)(girilenIntsayi / girilenDoublesayi));


    }
}
