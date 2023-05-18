package day42_Maps;

import day41_Maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C05_Maps {

    public static void main(String[] args) {

        // ogrenci map'inden numara isim ve soyism degerlerini yazdıralım

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);


    }
}
