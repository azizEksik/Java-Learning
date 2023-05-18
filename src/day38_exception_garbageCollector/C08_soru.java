package day38_exception_garbageCollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C08_soru {
    public static void main(String[] args) {

        // Soru 2) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(3);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        System.out.println(sayilar);

        ListIterator lt1= sayilar.listIterator();

        int sayac=0;
        Integer[] arr= new Integer[sayilar.size()];
        while (lt1.hasNext()){
            Integer sayi=(Integer)lt1.next();
            arr[sayac]=sayi;
            sayac++;
            if (sayac==sayilar.size()){
                sayilar.clear();
                for (int i = arr.length-1; i >=0 ; i--) {
                    sayilar.add(arr[i]);
                }
            }

        }
        System.out.println(sayilar);




    }
}
