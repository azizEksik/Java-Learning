package day44_MapsMethodlari;

import day41_Maps.MapDepo;

import java.util.HashMap;
import java.util.Map;

public class C01_mapsMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> mp1= new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        System.out.println(mp1.putIfAbsent("D", 9)); // null
        System.out.println(mp1.putIfAbsent("D",15)); // 9
        // putIfAbsent(Key,Value) methodu map'e elaman ekler
        // Ama ekleyecegi Key map'te yoksa ekler ve yazdirirsal null doner
        // ekleyecegi Key map'te varsa eklemez ve yazdirirsak var olan degeri bize getirir

        System.out.println(mp1); // {A=5, B=3, C=7, D=9}
    }
}
