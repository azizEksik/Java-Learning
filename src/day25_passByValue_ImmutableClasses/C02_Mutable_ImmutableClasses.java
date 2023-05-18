package day25_passByValue_ImmutableClasses;

import java.util.List;
import java.util.ArrayList;

public class C02_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        /*
            String ve Wrapper class'lar immutable oldukları için değiştirilemezler
            ancak Array ve List mutable oldukları için
            atama yapmsak da method kullanınca değerleri değişir
         */

        String str="Java gun gectikce daha da keyifli oluyor";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str); // Java gun gectikce daha da keyifli oluyor

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar); // [5, 8]

        sayilar.set(0,7);
        sayilar.remove(1);

        System.out.println(sayilar); // [7]
    }
}
