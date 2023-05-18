package day17_arrays;

import java.util.Arrays;

public class C03_sagaKaydirma {
    public static void main(String[] args){

        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.

        int[] arr={3,4,5,6};

        System.out.println(Arrays.toString(arrayiSagaKaydirma(arr)));

    }

    public static int[] arrayiSagaKaydirma(int[] array){

        int[] a=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            if (i==0){
                a[i]=array[array.length-1];
            }
            if (i>=1&&i<=array.length-1){
                a[i]=array[i-1];
            }

        }
        return a;
    }

}
