package day18_multiDimensionalArray;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        // verilen bir array'de istenen elmanın olup olmadığını bulur

        int[] arr= {4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 5)); // -2
        System.out.println(Arrays.binarySearch(arr,11)); // 4
        System.out.println(Arrays.binarySearch(arr,1)); // -1
        System.out.println(Arrays.binarySearch(arr,7)); // -2

        // Array'de binarySearch() methodunun düzgün çalışması için
        //  öncelikle sort() çalıştırılmalıdır

        System.out.println("======================");


        Arrays.sort(arr); // [1, 3, 4, 4, 5, 6, 7, 9, 11]

        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr,11)); // 8
        System.out.println(Arrays.binarySearch(arr,1)); // 0
        System.out.println(Arrays.binarySearch(arr,7)); // 6
        System.out.println(Arrays.binarySearch(arr,4)); // 2 // birden fazla varsa ilkini yazdırır

        // binarySearch() methodu aranan elemntin index'ini döner

        System.out.println(Arrays.binarySearch(arr,2)); // -2
        System.out.println(Arrays.binarySearch(arr,-3)); // -1
        System.out.println(Arrays.binarySearch(arr,8)); // -8
        System.out.println(Arrays.binarySearch(arr,10)); // -9
        System.out.println(Arrays.binarySearch(arr,13)); // -10
        System.out.println(Arrays.binarySearch(arr,20)); // -10

        // olmayan bir element  aratılırsa, önce array'de olsaydı nerede olurdu bunu buluyoruz
        // olması gereken sıranın - işaretli degerini veriyoruz
        // bu mantıkla en küçük elemntten daha kücük bitin sayılar için -1
        // en büyük elementten büyük olan bütün sayılar için de -(lenght+1) degeri döndürür
    }
}
