package day43_Maps;

import day41_Maps.MapDepo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_EntrySet {

    public static void main(String[] args) {

        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

        // Onceki iki derste key(Set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        // Ancak key ve value birlikte kullanmak istedigimizde
        // bu islemi yapmak zor olur

        // Bunun icin Java Entry Inteface'ini olusturmustur
        // Entry'ler key=value ikilisini bir entry olarak kabul ederler

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Aziz-Eksik-12-E-MF");

        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 6
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

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();

        System.out.println(ogrenciEntrySeti);
        /*
            [
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            ]

            Aralarindaki farklar
            1- yukaridaki Map, bu Set
            2- yukaridakinde suslu parantez {} kullaniyor, bu ise koseli parantez [] kullaniyor
            3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
               Entry'de ise Key=Value ikisi birlikte bir element olusturuyor
         */

        // Entry seti icerisindeki entey'leri biz de sira numarasi vererek yazdiralim

        int siraNo=1;

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){
            System.out.println(siraNo+"-   "+eachEntry);
            siraNo++;
        }

        // Entry'leri kullanarak Key'leri yazdırın

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){

            System.out.println(eachEntry.getKey());
        }

        // Entry'leri kullanarak tum ogrencilerin siniflarini 1 arttirin
        // 12. sinifta olan varsa, map'den çikarin

        // tum Entry'leri elden gecirelim
        String entryValue;
        String[] entryValueArr;
        for(Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti){
            // her bir entry'deki value'yu alip parcalayip istenen update'i yapip yeniden map'a eklememiz gerek
            entryValue =eachEntry.getValue(); // Ali-Can-10-H-MF
            entryValueArr=entryValue.split("-"); //[Ali, Can, 10, H, MF]

            if (entryValueArr[2].equals("12")){
                // ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun oldu");
            }else {
                // ogrencinin sinifi 12 degilse
                entryValueArr[2]=String.valueOf(Integer.parseInt(entryValueArr[2])+1); // [Ali, Can, 11, H, MF]
                eachEntry.setValue(entryValueArr[0]+"-"+
                                    entryValueArr[1]+"-"+
                                    entryValueArr[2]+"-"+
                                    entryValueArr[3]+"-"+
                                    entryValueArr[4]);
            }
        }

        System.out.println(ogrenciMap);

    }
}
