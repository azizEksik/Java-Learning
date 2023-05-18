package day06_bagimzsizIfCumleleri;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {

        /*
        Eger bir olay icin sadece 2 olasilik varsa
        ve bu olasiliklardan birisi mutlaka calisacaksa
        if Else statements kullaniriz
         */

        //soru-Kullanicidan notunu alin 50 veya  daha buyukse "Sınıfı geçtin"
        //50'den kucukse "Malesef kaldın" yazdırın

        /*Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not1= scan.nextDouble();

        if (not1>=50 && not1<=100){
            System.out.println("Sınıfı geçtiniz");
        }

        else {
            System.out.println("Malesef kaldınız");
        }

         */

        //soru- kullanicidan pozitif bir tamsayi alin
        //sayinin tek veya cift oldugunu yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayı giriniz");

        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
        }
        if (sayi%5==0){
            System.out.println("5 ile kalansız bölünebilir");
        }else {
            System.out.println("5 ile kalansız bölünemez");
        }




    }
}
