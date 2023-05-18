package day12_forLoops;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 20'den  küçük bir pozitif tamsayı giriniz");

        int sayi= scan.nextInt();

        int faktoryel=1;


        for (int i = 1; i <=sayi ; i++) {

            faktoryel*=i;

        }

        System.out.println("Girilen sayının faktöriyeli : "+ faktoryel);

    }
}
