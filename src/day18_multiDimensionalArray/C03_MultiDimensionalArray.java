package day18_multiDimensionalArray;

import java.util.Arrays;

public class C03_MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr={{3,4,5},{2,3},{1}};

        // int[][] iki katlı array belirtir
        // ilk [] ana array'i (outerArray) kontrol eder
        // ikinci [] ise içerideki array'leri (innerArray) kontrol eder

        System.out.println(arr[1][1]); // 3

        System.out.println(arr[0][2]); // 5

        System.out.println(arr[2].length); // 1

        System.out.println(arr[1]); // [I@48140564

        System.out.println(Arrays.toString(arr[1])); // [2, 3]

        System.out.println(Arrays.toString(arr)); // [[I@58ceff1, [I@48140564, [I@7c30a502]

        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]] // Arrays.deepToString

        System.out.println(arr.length); // 3





    }
}
