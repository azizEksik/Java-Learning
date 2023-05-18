package day44_MapsMethodlari;

import day41_Maps.MapDepo;

import java.util.Map;

public class C02_mapsMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        /*
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            }
         */

        System.out.println(ogrenciMap.containsKey(105)); // true
        System.out.println(ogrenciMap.containsKey(111)); // false

        System.out.println(ogrenciMap.containsValue("11")); // false
        // value'su 10 olan bir deger yok, containsValue() ile sorgulama yaparken tum value'yu almaliyiz
        // value içinden bir deger ile sorgu yaparsak false doner
        System.out.println(ogrenciMap.containsValue("Ali-Can-10-H-MF")); // true


    }
}
