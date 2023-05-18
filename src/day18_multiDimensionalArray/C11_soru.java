package day18_multiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C11_soru {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};

        // ortak index kullanabilmek için en kısa olanı bulalıyoz

        int enKisalenght=arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length<enKisalenght){
                enKisalenght=arr[i].length;
            }

        }

        int[] toplamlarArrayi=new int[enKisalenght];

        int intindextekiElemtlerToplami=0;

        for (int i = 0; i <toplamlarArrayi.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                intindextekiElemtlerToplami+=arr[j][i];
            }
            toplamlarArrayi[i]=intindextekiElemtlerToplami;
            intindextekiElemtlerToplami=0;
        }

        System.out.println(Arrays.toString(toplamlarArrayi));

    }
}
