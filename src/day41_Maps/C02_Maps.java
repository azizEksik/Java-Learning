package day41_Maps;

import java.util.Map;

public class C02_Maps {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(105,"Hasan-Can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");

        System.out.println(ogrenciMap);

        /*

            Eger Map'te olan bir Key ile yeni bir eklerseniz
            O Key'e ait var olan value silinir ve yeni value geçerli olur

            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Hasan-Can-11-K-MF,
            106=Fatma-Han-10-K-Soz,
            108=Hikmet-Han-10-M-TM}
         */

        // 108 numaralı ogrencinin isim ve soyismini yazdırın

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,108));

        // 104 numaralı ogrencinin şubesini "K" yapın

        int ogrenciKey=104;

        System.out.println(ogrenciMap.get(ogrenciKey)); // Ayse-Can-10-H-MF
        System.out.println(MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, ogrenciKey, "K")); // true
        System.out.println(ogrenciMap.get(ogrenciKey)); // Ayse-Can-10-K-MF

        System.out.println(ogrenciMap.get(104)); // Ayse-Can-10-K-MF
    }
}
