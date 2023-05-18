package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {

        // kullanıcıdan 10'dan küçük iki pozitif tam sayı alıp
        // faktoryel degerlerini toplayın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 10'dan küçük iki tane pozitif tamsayı giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int sonuc=  C03_FaktoryelMethodu.faktoryelHesapla(sayi1)
                        + C03_FaktoryelMethodu.faktoryelHesapla(sayi2);

        System.out.println(sonuc);

    }
}
