package day18_multiDimensionalArray;

import java.util.Arrays;

public class C04_MultiDimensionalArray {
    public static void main(String[] args) {


        String[][] siniflar={{"A","B","G","M"},{"F","H","A","V"},{"K","D","Q"}};

        // G'yi yazdırın

        System.out.println(siniflar[0][2]); // G

        // Q'yu Y yapın

        siniflar[2][2]= "Y";

        System.out.println(siniflar[2][2]); // Y

        // İlk sınıfın mevcudunu yazdırın

        System.out.println(siniflar[0].length); // 4

        // siniflarda toplam kaç kişi olduğunu yazdırın

        int toplamOgrSayisi=0;

        for (int i = 0; i < siniflar.length; i++) {

           toplamOgrSayisi+=siniflar[i].length;

        }
        System.out.println(toplamOgrSayisi); // 11
    }
}
