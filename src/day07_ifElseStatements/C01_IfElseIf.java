package day07_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen dönem sonu notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Notunuzu yanlış girdiniz");
        } else if (not>=85) {
            System.out.println("AA ile geçtiniz");

        } else if (not>=65) {
            System.out.println("BB ile geçtiniz");
            
        } else if (not>=50) {
            System.out.println("CC ile geçtiniz");

        }else {
            System.out.println("DD ile kaldınız");
        }




    }
}
