package day42_Maps;

import day41_Maps.MapDepo;

import java.util.Map;

import java.util.List;

public class C04_Maps {

    public static void main(String[] args) {

        // Ogrenci map'inde numarası verilen sayıların arasında(sinirlar dahil) olan ogrencilerin
        // isim soyisim ve bölümlerini List oalrak bize döndüren bir method olusturun

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        ogrenciMap.put(103,"Hikmet-Saglam-11-M-Soz");

        int baslangicNo=103;
        int bitisNo=107;

        List<String> isimListesi= MapDepo.numaraDegerineGoreListe(ogrenciMap,baslangicNo,bitisNo);

        System.out.println(ogrenciMap);

        System.out.println(isimListesi); // [Hikmet Saglam Soz, Ayse Can MF, Ayse Cem TM, Fatma Han Soz, Tugay Cil MF]




    }
}
