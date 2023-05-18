package day17_arrays;

import java.util.Arrays;

public class C02_soru {
    public static void main (String[] args){

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int[] arr2={-3,-6,1,0,8,-9,-11,3};

        int[] arr3=arraydekiPozitifTamSayilariToplama(arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public static int[] arraydekiPozitifTamSayilariToplama(int[] array){

        int toplam=0;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]>0){
                toplam+=array[i];
            }
        }
        int[] a={toplam};
        return a;
    }
}
