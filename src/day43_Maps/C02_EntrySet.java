package day43_Maps;

import day41_Maps.MapDepo;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class C02_EntrySet {
    public static void main(String[] args) {

        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(109,"Adem-Demir-11-D-Soz");

        // Soz, 11, D, Adem Demir, 109
        // bu formatta Stringler olusturup bir treeSet'e atayan
        // ve bu set'i bize donduran bir method olusturun

        Set<String> siraliOgrenciListesi= MapDepo.siraliOgrenciListesiOlustur(ogrenciMap);

        System.out.println(siraliOgrenciListesi);
        /*
            [
            MF 10 H Ali Can,
            MF 10 H Ayse Can,
            Soz 10 K Fatma Han,
            Soz 11 D Adem Demir,
            Soz 11 M Veli Cem,
            TM 11 H Ali Cem,
            TM 11 M Ayse Cem
            ]
         */


    }
}
