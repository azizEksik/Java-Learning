package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {


        //Kullanıcıdan bir sayı alın, sayı tek ise negatif veya pozitif tek sayı olduğunu yazdırın
        //sayı çift ise 10'un tam katı olup olmadığını yazdırın

        Scanner sca=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");

        double sayi= sca.nextDouble();

        if (sayi%2!=0){
            if (sayi<0){
                System.out.println("Negatif tek sayı");
            }else {
                System.out.println("Pozitif tek sayı");
            }


        }else {
            if (sayi%10==0){
                System.out.println("Girilen çift Sayı 10'un tam katı");
            }else{
                System.out.println("girilen çift sayı 10'un katı değil");
            }


        }


    }
}
