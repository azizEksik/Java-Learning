package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A, B, K]


        System.out.println(harfler.remove("B")); // true

        System.out.println(harfler); // [A, K]

        System.out.println(harfler.remove(0)); // A

        System.out.println(harfler); // [K]

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar); // [1, 3, 18, 2]

        /*
            eger sadece sayılardan oluşan  bir list varsa
            renove method'una yazacağımız sayıyı index olarak kabul eder

            Eger sayiyi silmek isterseniz
            remove methodundan once o sayıyı bir objeye atayıp
            remove methodunda obje ismini yazabiliriz
         */

        sayilar.remove(1);

        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi=1;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [18, 2]


    }
}
