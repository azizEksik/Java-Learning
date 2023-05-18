package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler={"Nurefsan","Berke","Mustafa"};
        int[] sayilar={3,4,5,6,7,8,9};
        char karakterler[]={'e','a','b'};

        // Array non-primitive data türlerindendir
        // Eger array'i liste şeklinde oluşturmayıp
        // new keyword kullanıyorsak
        // UZUNLUGUNU yazmak ZORUNDAYIZ

       // String [] arr= new String[]; // kabul etmez uzunluk yok

        String [] arr= new String[5];

        // bir array tanımlanan uzunluktan daha fazla veya az eleman alamaz

        // Bir array'i yazdırmak istersek;
        //Array'ler direkt yazdırılamaz

        System.out.println(isimler); // [Ljava.lang.String;@48140564 // referansını verdi

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 5, 6, 7, 8, 9]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int[] a= new int[7];

        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0]

        // Array'deki elementlere nasıl ulaşırız ? index ile

        a[0] =4; // [4, 0, 0, 0, 0, 0, 0]
        a[3]=7; // [4, 0, 0, 7, 0, 0, 0]
        //a[7]=8; RTE // olmayan index'e deger atamasını yapamazsınız

        System.out.println(Arrays.toString(a));

        // sayılar Arayy'inin 4. index'indeki elementi yazdırın

        System.out.println(sayilar[4]); // 7

        // isimler Array'inin 1. index'indeki yazdırın

        System.out.println(isimler[1]); // Berke

    }
}
