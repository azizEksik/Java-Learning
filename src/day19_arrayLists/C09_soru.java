package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_soru {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        String[] isimler={"aziz","aslan","halil","kamil","zürafa"};

        System.out.println(elemtSilme(isimler, "z"));

    }

    public static List<String> elemtSilme(String[] array, String harf){

        List<String> yeniList=new ArrayList<>();

        for (int i = 0; i <array.length ; i++) {
            String a=array[i];
            if (!a.contains(harf)){
                yeniList.add(array[i]);
            }
        }
        return yeniList;
    }

}
