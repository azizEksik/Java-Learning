package day41_Maps;

import java.util.*;

public class MapDepo {


    // ogrenci map olusturup bize donduren method olusturun

    public static Map<Integer,String> ornekMapOlustur(){

        Map<Integer,String> ogrenciMap= new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;

    }

    public static String isimSoyisimDondur(Map<Integer,String> ogrenciMap, int ogrenciKey){

        String ogrenciValue= ogrenciMap.get(ogrenciKey); // Ayse-Cem-11-M-TM

        String[] valueArr= ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim=valueArr[0] + " " + valueArr[1]; // Ayse Cem

        return isimSoyisim;

    }

   public static boolean ogrenciyeYeniSubeAta(Map<Integer,String> ogrenciMap, Integer ogrenciKey, String yeniSube){

       boolean sonuc;
       try {
           String ogrenciValue=ogrenciMap.get(ogrenciKey);

           String[] valueArr= ogrenciValue.split("-");

           valueArr[3]=yeniSube;

           String valueArrStr="";

           for (int i = 0; i < valueArr.length; i++) {
               if (!valueArr[i].equals(valueArr[valueArr.length-1])){
                   valueArrStr+=valueArr[i]+"-";
               }else {
                   valueArrStr+=valueArr[i];
               }
           }

           ogrenciMap.put(ogrenciKey,valueArrStr);

           if (ogrenciMap.containsKey(ogrenciKey)){
               sonuc=true;
           }else {
               sonuc=false;
           }
       } catch (NullPointerException e) {
           sonuc=false;
       }
       return sonuc;

   }

   public static void subeOgrenciBilgileriniYazdir(Map<Integer,String> ogrenciMap, String sube){

       Collection<String> ogrenciValueCollection = ogrenciMap.values();

       /*
            [
            Ali-Can-10-H-MF,
            Veli-Cem-11-M-Soz,
            Ali-Cem-11-H-TM,
            Ayse-Can-10-H-MF,
            Ayse-Cem-11-M-TM,
            Fatma-Han-10-K-Soz
            ]
        */

       List<String> ogrenciIsimSoyisimSinif= new ArrayList<>();

       for (String each : ogrenciValueCollection){

           String[] ogrenciValueArr= each.split("-");

           if (ogrenciValueArr[3].equals(sube)){

               String isimSoyisimSinif= ogrenciValueArr[0]+" "+ogrenciValueArr[1]+" "+ogrenciValueArr[2];

               ogrenciIsimSoyisimSinif.add(isimSoyisimSinif);
           }
       }

       System.out.println(sube+" Subesine ait ogrencilerin  isim, soyisim ve sınıfları : "+ogrenciIsimSoyisimSinif);
   }

   public static List<String> numaraDegerineGoreListe(Map<Integer,String> ogrenciMap, int baslangicNo, int bitisNo){

        Set<Integer> ogrenciKey= ogrenciMap.keySet();

        List<String> isimListesi= new ArrayList<>();

        for(Integer each : ogrenciKey){

            if (each>=baslangicNo && each<=bitisNo){
                String ogrenciMapValue= ogrenciMap.get(each);
                String[] ogrenciMapValueArr= ogrenciMapValue.split("-");
                String isimSoysimiBolum= ogrenciMapValueArr[0]+" "+ogrenciMapValueArr[1]+" "+ogrenciMapValueArr[4];
                isimListesi.add(isimSoysimiBolum);
            }
        }

        return isimListesi;

   }

   public static void numaraIsimSoyisimYazdir(Map<Integer,String> ogrenciMap){

       Set<Integer> ogrenciKey = ogrenciMap.keySet();

       String value;
       String[] valueArr;
       String numaraIsimSoyisim;
       for (Integer key: ogrenciKey){
           value=ogrenciMap.get(key);
           valueArr=value.split("-");
           numaraIsimSoyisim=key+" "+valueArr[0]+" "+valueArr[1];
           System.out.println(numaraIsimSoyisim);
       }

   }

   public static Set<String> siraliOgrenciListesiOlustur(Map<Integer,String> ogrenciMap){

       Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

       Set<String> ogrenciTreeSet= new TreeSet<>();
       String value;
       String[] valueArr;
       for (Map.Entry<Integer,String> entryEach : ogrenciEntrySeti){

           value=entryEach.getValue()+"-"+entryEach.getKey();
           valueArr= value.split("-");
           ogrenciTreeSet.add(valueArr[4]+" "+
                   valueArr[2]+" "+
                   valueArr[3]+" "+
                   valueArr[0]+" "+
                   valueArr[1]);
       }
       return ogrenciTreeSet;
   }




}
