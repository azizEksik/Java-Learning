package day38_exception_garbageCollector;

import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {

        int[] arr={3,8,1,9,15};

        // tum elementleri yazdırın

        // for-each
        for (int each : arr){

            System.out.print(each + " "); // 3 8 1 9 15
        }
        System.out.println();

        // for loop

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 3 8 1 9 15
        }
        System.out.println();

        // Index kullanmadan tüm elemntleri 3 arttırıp kaydedin
        // index istenmediği için normal loop kullanamayız

        // for each loop ile deneyelim

        for (int each : arr){

            each=each +3;

            System.out.print( each + " "); // 6 11 4 12 18
        }
        System.out.println();

        System.out.println(Arrays.toString(arr)); // [3, 8, 1, 9, 15]


    }
}
