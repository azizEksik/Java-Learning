package day17_arrays;

import java.util.Arrays;

public class C09_sort_binarySearch {
    public static void main(String[] args) {

        // verilen bir array'i natural order'a göre sıralamak için
        // Arrays.sort() method'u kullanılır

        int[] arr1={3,9,6,1,7};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1)); // [1, 3, 6, 7, 9]

        String[] arr2={"Hasan","Hüseyin","Mehmet","Mesut","Mercan","ali"};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2)); // [Hasan, Hüseyin, Mehmet, Mercan, Mesut, ali]

        // sort yapıldıktan sonra
        // Array'de bir elementin var oldugunu kontrol etmek için

        System.out.println(Arrays.binarySearch(arr2, "ali")); // 5

    }
}
