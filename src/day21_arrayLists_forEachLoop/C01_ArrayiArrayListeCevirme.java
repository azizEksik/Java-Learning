package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

       Integer[] arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr Array'inin elementlerini içeren bir ArrayList oluşturun

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("sayilar listesi : " + sayilar);

        /*
            Java'da bir array'i array list'e çevirmek için kullanılan asList() vardir
            Ancak kullanımı tavsiye edilmez, çünkü iki tane büyük dezavantajı vardır

            1- asList() kullanılarak array'den List'e çevrilen listelerde
               ekleme / silme gibi uzunluğu değişteren method'lar kullanılamaz

            2- Arka planda array ve array'den dönüştürdüğümüz list beraber hareket eder
               birinde yaptığımız update'ler ötekine de işlenir
         */

        List<Integer> arraydenList= Arrays.asList(arr);

        System.out.println("Arrayden liste çevirilen : " +arraydenList); //

        // iki liste'de 11 ekleyelim

        sayilar.add(11);
       // arraydenList.add(11); // UnsupportedOperationException

        System.out.println("sayilar listesi : " + sayilar);
        System.out.println("Arrayden liste çevirilen : " +arraydenList);

        // iki list'in 0. index'indeki elementleri silelim

        sayilar.remove(0);
       // arraydenList.remove(0); // UnsupportedOperationException

        System.out.println("sayilar listesi : " + sayilar);
        System.out.println("Arrayden liste çevirilen : " +arraydenList);

        // 2. dezavantaj

        System.out.println("Array :          " +Arrays.toString(arr));
        System.out.println("Array'den List : " +arraydenList);

        // array'in bir elemntine yeni deger atayalım

        arr[0]=22;

        System.out.println("===== List'i degistirdikten sonra =====");

        System.out.println("Array :          " +Arrays.toString(arr));
        System.out.println("Array'den List : " +arraydenList);

        // list'in bir elementini update edelim

        arraydenList.set(1,45);

        System.out.println("Array :          " +Arrays.toString(arr));
        System.out.println("Array'den List : " +arraydenList);


    }
}
