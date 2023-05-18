package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_soru {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.

        System.out.println(tamBolenSayilar(60));
    }

    public static List<Integer> tamBolenSayilar(int sayi){

        List<Integer> yeniList=new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                yeniList.add(i);
            }
        }
        return yeniList;
    }
}
