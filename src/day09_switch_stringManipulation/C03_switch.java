package day09_switch_stringManipulation;

import java.util.Scanner;

public class C03_switch {
    public static void main(String[] args) {

        //soru- kullanıcıdan ay numarasını alıp  mevsimi yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen ay numarasını giriniz");

        int numara= scan.nextInt();

        switch (numara){

            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            case 12:
                System.out.println("Kış");
                break;
            default:
                System.out.println("Geçersiz ay numarası");

        }

    }
}
