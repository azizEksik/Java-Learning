package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {

        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz");

        String metin= scan.nextLine();

        metin=metin.replaceAll("\\d","");
        metin=metin.replaceAll("\\W","");
        metin=metin.toUpperCase().charAt(0) + metin.toLowerCase().substring(1);
        metin=metin.substring(0,4) +" "+ metin.substring(4,12)+" "+ metin.substring(12,14)+" "+ metin.substring(14,19);


        System.out.println(metin);





    }
}
