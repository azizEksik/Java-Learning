package day42_Maps;

import day41_Maps.MapDepo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Hasan-Yan-12-H-MF");
        ogrenciMap.put(101,"Adem-Fan-12-T-Soz");


        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve sınıflarını yazdıralım

        /*
            {
            101=Adem-Fan-12-T-Soz,
             102=Veli-Cem-11-M-Soz,
             103=Ali-Cem-11-H-TM,
             104=Ayse-Can-10-H-MF,
             105=Ayse-Cem-11-M-TM,
             106=Fatma-Han-10-K-Soz,
             107=Hasan-Yan-12-H-MF
             }

         */

        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,"H"); // H Subesine ait ogrencilerin  isim, soyisim ve sınıfları :
                                                                   // [Ali Can 10, Ali Cem 11, Ayse Can 10, Fatma Han 10]



    }
}
