package day03_scanner_dataCasting;

import java.util.Scanner;

public class alistirma {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adınız girin");

        String isim= scan.nextLine();



        System.out.println("Lütfen soyadınız girin");

        String soyIsim= scan.nextLine();
        System.out.println("Lütfen yaşınızı girin");


        int yas= scan.nextInt();

        System.out.println("Adınız : " + isim);

        System.out.println("Soyadınız : " + soyIsim);

        System.out.println("Yaşınız : " +  yas);


    }
}
