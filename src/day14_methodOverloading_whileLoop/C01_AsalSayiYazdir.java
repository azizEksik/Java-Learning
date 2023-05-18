package day14_methodOverloading_whileLoop;

import java.util.List;
import java.util.Scanner;

public class C01_AsalSayiYazdir {
    public static void main(String[] args) {

        // Verilen pzitif bir tamsayının
        // asal olup olmadığını yazdıran bir method oluşturun

        int falg=0;
        for (int i = 2; i <8 ; i++) {
            if (8%i==0 && 6%i==0){
                falg++;
                break;
            }
        }
        if (falg==0){
            System.out.println("girilen sayılar aralarında asaldır");
        }else {
            System.out.println("Girilen sayılar aralarında asal değildir");
        }

    }

    public static void asalsayi(int sayi){

        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi % i ==0){
                flag++;
                break;
        }

        }

        if (sayi==2){
            System.out.println("Girilen " + sayi + " sayisi  ASAL bir sayıdır");

        }else if (flag==0){
            System.out.println("Girilen " + sayi + " sayisi  ASAL bir sayıdır");
        }else {
            System.out.println("Girilen " + sayi + " sayisi  ASAL bir sayı değildir");
        }


    }

}
