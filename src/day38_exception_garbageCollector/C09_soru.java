package day38_exception_garbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C09_soru {
    public static void main(String[] args) {

        //Soru 3) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator
        //kullanarak 5 artirin.
        //Orn : list : [2,13,56,23,45,14,40]
        //artirilmasi istenen eleman sayisi : 3
        //output: [7,18,61,23,45,14,40]

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

        while (lt1.hasNext()){
            lt1.set((Integer)lt1.next()+5);
        }
        System.out.println(sayilar);
    }
}
