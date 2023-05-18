package day18_multiDimensionalArray;

import java.util.Arrays;

public class C12_soru {
    public static void main(String[] args) {

        //Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int[] toplamArray=new int[arr.length];

        int indexToplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                indexToplam+=arr[i][j];
            }
            toplamArray[i]=indexToplam;
            indexToplam=0;
        }
        System.out.println(Arrays.toString(toplamArray));
    }
}
