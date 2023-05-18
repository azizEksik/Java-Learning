package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        System.out.println(sayilar.get(0)); // 3

        // son elemti yazdırın

        System.out.println(sayilar.get(sayilar.size()-1)); // 2

        // 2 elemtini 12 yapın

        System.out.println(sayilar.set(2, 12)); // 2 // bize güncelenen eski elemanı gösterir yazdırırsak

        // 5'i 7 yapalım

        System.out.println(sayilar.set(1, 7)); // 5

        System.out.println(sayilar); // [3, 7, 12]


    }
}
