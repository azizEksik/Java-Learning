package day07_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir yıl giriniz : ");

        int yil= scan.nextInt();

        if (yil%4!=0){
            System.out.println("Artik yıl değil");
        } else if (yil%100!=0) {
            System.out.println("Artık yıldır");

        } else if (yil%400==0) {
            System.out.println("Artık yıldır");
            
        }else {
            System.out.println("artık yıl degil");
        }


    }
}
