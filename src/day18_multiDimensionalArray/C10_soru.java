package day18_multiDimensionalArray;

import java.util.Arrays;

public class C10_soru {

    public static void main(String[] args) {

        //Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int[][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        System.out.println(tumElemntlerinCarpimi(arr));


    }
    public static int tumElemntlerinCarpimi(int[][]arr){

        int toplam=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam*=arr[i][j];
            }
        }
        return toplam;
    }
}
