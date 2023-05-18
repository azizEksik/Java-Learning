package day09_switch_stringManipulation;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {

        //soru- Kullanıcıdan ISTQB kısaltmasından harfin anlamını öğrenmek istediğini alın
        //ve girilen harfin karşılığını yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ISTQB kısaltmansından anlamını öğrenmek istediğiniz harfi girin");

        char harf=scan.next().charAt(0);

        harf=Character.toUpperCase(harf);

        switch (harf){

            case 'I':
                System.out.println("Internatıonal");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;

        }

    }
}
