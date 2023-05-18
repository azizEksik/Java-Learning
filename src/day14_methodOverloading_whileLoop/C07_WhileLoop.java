package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        /*
        Başlangıç ve bitiş degeri belli olan
        veya kaç kere tekrar edileceği bilinen loop'larda
        for loop ideal olarak kullanılabilir


        Ancak tekrar sayısı belli olmayan
        başlangıç veya bitişi başka variable'a bağlı olan durumlarda
        for loop yerine while loop tercih edilir
         */

        // 50 ve 100 arasındaki (sınırlar dahil)
        // sayıları toplayın

        int toplam=0;

        for (int i = 50; i <=100 ; i++) {

            toplam+=i;

        }
        System.out.println("sayıların toplamı : "+toplam);

        // aynı soruyu while loop ile yapalım
        // for loop'da 3 seyi takip ederiz
        // 1- başlangıç degeri
        // 2- bitiş şartı
        // 3_ artış veya azalış şekli

        toplam=0;

        int sayi=50;

        while (sayi<=100){

            toplam+=sayi;

            sayi++;
        }

        System.out.println("While ile toplam : " + toplam);
    }
}
