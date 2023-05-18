package day42_Maps;

import day41_Maps.MapDepo;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_Maps {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();

        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve sınıflarını yazdıralım

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


        Set<Integer> ogrenciKeyleri = ogrenciMap.keySet(); // bir map'deki tüm keyleri Set olarak döndürür

        /*
            [101, 102, 103, 104, 105, 106]
         */

        Collection<String> ogrenciValueCollection = ogrenciMap.values(); // bir map'deki tüm value'ları Collection olarak döndürür

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

        /*
            Normalde bilgiler arasına Java "," kullanır
            biz de virgül kullanabiliriz
            Ancak bu durumda Value Collection'ının kac elemanlı olduguna dikkat etmemiz gerekir
            virgülle ayrılamış çok fazla element olabilir
            Fakat Value'lerin bir bütün olarak TEK BİR STRİNG oldugunu unutmamalıyız

             [Ali, Can, 10, H, MF, Veli, Cem, 11, M, Soz, Ali, Cem, 11, H ,TM, Ayse, Can, 10, H, MF, Ayse, Cem, 11, M, TM, Fatma, Han, 10, K, Soz]
         */


    }
}
