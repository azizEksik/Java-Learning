package day41_Maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        // 8. satırdan sonra map üzerinde yapacağımız her değişiklik
        // bu class'daki ogrenciMap'i etkiler

        // Map'in bu halini görelim

        System.out.println(ogrenciMap);
        /*
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz}
         */

        // Map'e 1 tane yeni elemt ekleyelim
        ogrenciMap.put(110,"Ftaih-Yan-10-T-MF");

        // 102 numarı ogrenciyi update edelim

        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");

        // 103 nolu ogrencinin isim ve soyisimini yazdırın

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 103)); // Ali Cem

        // 105 nolu ogrencinin subesini T yapın

        MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"T");
        System.out.println(ogrenciMap.get(105)); // Ayse-Cem-11-S-TM

        System.out.println(ogrenciMap);

        /*
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Dem-12-D-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-T-TM,
            106=Fatma-Han-10-K-Soz,
            110=Ftaih-Yan-10-T-MF}
         */

    }
}
