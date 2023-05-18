package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C03_soru {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.
        usluSayi(5,5);

    }

    public static void usluSayi(int sayi, int ussu){

        int toplam=1;
        int adet=0;

        while (ussu!=adet){
            toplam*=sayi;
            adet++;
        }
        System.out.println(sayi+" sayısının " +ussu+" kuvveti : " +toplam);

    }
}
