package day19_arrayLists;

import day17_arrays.C06_ArrayeElemanEkleme;
import day17_arrays.C07_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        /*

            ArrayList, uzunluğu esnek bir listedir
            Array alt yapısını kullanır ancak ekleme ve silme gibi işlemlerde daha avantajlıdır

            ArrayList'in tek dezavantajı var
            o da elemtleri tek tek eklememiz gerekmesi
         */

        int[] arr={3,4};

        arr=C07_ArrayElemanEklemeMethodu.arrayeElementEkleme(arr,5);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5]

        arr=C07_ArrayElemanEklemeMethodu.arrayeElementEkleme(arr,15);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 15]


        List<String> harfler = new ArrayList<>();

        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // [s, l, a] // ekleme sırasına göre ekliyor

        int [] array={0,2,4,6,7,1,8,9,4,0,0,3,5,6};

        for (int i = 0; i < array.length; i++) {


            }



    }
}
