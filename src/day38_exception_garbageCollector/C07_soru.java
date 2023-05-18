package day38_exception_garbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C07_soru {
    public static void main(String[] args) {

        //Soru 1) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
        //yaziniz . (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
        //Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
        //output: [23,40]

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(3);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

        ListIterator lt1= sayilar.listIterator();

        while (lt1.hasNext()){
            Integer sayi= (Integer)lt1.next();
            if (sayi<20){
                lt1.remove();
            }
            if (sayi>40){
                lt1.remove();
            }
        }
        System.out.println(sayilar); // [23, 40]
    }
}
