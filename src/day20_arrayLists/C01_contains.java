package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_contains {
    public static void main(String[] args) {

        //  uzun bir listeyi javada list olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array oluşturup
        // loop ile tüm elemntleri List'e ekleyebiliriz

        int[] arr={2,3,5,5,6,1,4,3,8,9,7,4,5,1,0,6,8,7};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); // [2, 3, 5, 5, 6, 1, 4, 3, 8, 9, 7, 4, 5, 1, 0, 6, 8, 7]

        // listede elemt olarak 3 var mı

        System.out.println(sayilar.contains(3)); // true

        System.out.println(sayilar.contains(11)); // flase

        sayilar.clear(); // bu method bütün listeyi temizler

        System.out.println(sayilar); //[]


    }
}
