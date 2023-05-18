package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_soru {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Rakamları toplanacak  pozitif tamsayı giriniz");
        int girilenSayi= scan.nextInt();
        int sayi=girilenSayi;
        int toplam=0;
        int birler=0;

        while (sayi>0){
            birler= sayi%10;
            toplam+=birler;
            sayi=sayi/10;
        }
        System.out.println(toplam);
        System.out.println(C04_RakamlarToplaminiBul.rakalarToplaminiBul(girilenSayi));

    }
}
