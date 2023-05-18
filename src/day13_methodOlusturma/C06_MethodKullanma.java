package day13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {

        // verilen bir String'in Palidron olup olmadığını yazdırın
        // Palidron : Düzden ve Tersten aynı şekilde yazılan

        Palidron();

    }

    public static void Palidron(){
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz");

        String metin= scan.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1 ; i>=0 ; i--) {

            tersMetin+=metin.charAt(i);

        }

        if (metin.equals(tersMetin)){
            System.out.println("Palidrondur");
        }else {
            System.out.println("Palidron değildir");
        }

    }
}
