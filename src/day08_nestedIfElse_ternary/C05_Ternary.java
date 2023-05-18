package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan pozitif  bir tamsayı alın
        // sayı çift ise "sayı çift"
        // değilse "tek sayı" yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Çift sayı");
        }else {
            System.out.println("Tek sayi");
        }

        //Ternary kullanırsak;
        /*
        Ternary basit işlemlerde kullanırız
         */

        System.out.println(sayi%2==0 ? "Çift sayı" : "Tek sayı");


    }
}
