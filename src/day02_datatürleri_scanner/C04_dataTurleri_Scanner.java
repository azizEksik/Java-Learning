package day02_datatürleri_scanner;

import java.util.Scanner;

public class C04_dataTurleri_Scanner {
    public static void main(String[] args) {
        //1. adım scanner objesi olusturun


        Scanner scan= new Scanner(System.in);

        //2. adım kullanıcıya ne istediginizi soyleyin

        System.out.println("Lutfen isminizi giriniz");

        //3.adim girilen bilgiyi içine koyabileceğimiz bir varriable olusturun

        String kullaniciIsmi= scan.next();

    }

}
