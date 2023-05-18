package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir tamsayı alıp
        //mutlak değerine çevirip yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int sayi= scan.nextInt();
        /*

        if (sayi>=0){
            System.out.println(sayi);
        }else {
            System.out.println(sayi*-1);
        }

         */

        sayi = sayi>=0 ? sayi : sayi*(-1);

        System.out.println(sayi);

    }
}
