package day18_multiDimensionalArray;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // bir string'i istediğimiz parçalara ayirmak için kullanılır

        String str="Java Candir can, bundan şüphesi olan var mı?";

        // str kaç kelimedir?

        String[] kelimeler= str.split(" "); // [Java, Candir, can.]

        int a=kelimeler.length;

        System.out.println("kelime sayıs : " + a);

        // en uzun kelime kaç harflidir?

        String enUzunKelime=kelimeler[0];
        String enKisaKelime=kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length()>enUzunKelime.length()){
                enUzunKelime=kelimeler[i];
            }
            if (kelimeler[i].length()<enKisaKelime.length()){
                enKisaKelime=kelimeler[i];
            }

        }
        System.out.println("En uzun kelimenin harf sayısı : " + enUzunKelime.length());
        System.out.println("En kısa kelimenin harf sayısı : " + enKisaKelime.length());

        // bir String'i karakterlerine ayrıma istersek split() methoduna hiçlik ekleriz

        String[] karakterler=str.split(""); // [J, a, v, a,  , C, a, n, d, i, r,  , c, a, n, ,,  , b, u, n, d, a, n,  , ş, ü, p, h, e, s, i,  , o, l, a, n,  , v, a, r,  , m, ı, ?]

        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : "+ karakterler.length); // Cumledeki karakter sayisi : 44
    }
}
