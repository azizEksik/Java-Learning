package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class C09_soru {
    public static void main(String[] args) {

        //Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");

        String kelime= scan.nextLine();

        int cift=kelime.length()/2;

        int tek=(kelime.length()-1)/2;


        if (kelime.length()%2==0){
            System.out.println(kelime.substring(0,cift) + ":)" + kelime.substring(cift,kelime.length()));
        }else {

            System.out.println(kelime.substring(0,tek) + ":(" +
                    kelime.substring(kelime.length()-tek,kelime.length()));

        }

    }
}
