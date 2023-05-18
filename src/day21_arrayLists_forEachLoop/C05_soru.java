package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_soru {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.

        String[] arr={"aziz","ahmet","mehmet","furkan","mustafa"};

        List<String> isimler=new ArrayList<>();

        for (String each:arr
             ) {
            if (each.length()%2==0){
                int cift=each.length()/2;
                isimler.add(each.substring(0,cift));
            }else {
                int tek=each.length()/2;
                isimler.add(each.substring(tek,each.length()));
            }

        }
        System.out.println(isimler);
    }
}
