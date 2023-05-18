package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip ,
        // yeni halini bize döndüren bir method oluşturun

        int[] arr={2,4,7,8};

        // arr'ye methodu kullanarak 5 ekleyin

        arr=arrayeElementEkleme(arr,5);
        arr=arrayeElementEkleme(arr,3);
        arr=arrayeElementEkleme(arr,19);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayeElementEkleme(int[] array, int eklenecekElement ){

        int[] yeniArr =new int[array.length+1];

        for (int i = array.length-1; i >=0 ; i--) {

            yeniArr[i]=array[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekElement;
        return yeniArr;
    }
}
