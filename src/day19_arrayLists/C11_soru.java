package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_soru {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        kullaniciyaListOlusturtma();
    }

    public static List<String> kullaniciyaListOlusturtma(){

        Scanner scan=new Scanner(System.in);

        String girilenIsim="aziz";

        List<String>  yeniList=new ArrayList<>();

        while (girilenIsim.charAt(0)!='q' && girilenIsim.charAt(0)!='Q'){

            System.out.println("isim giriniz");
            girilenIsim=scan.nextLine();

            if (girilenIsim.charAt(0)!='q'  && girilenIsim.charAt(0)!='Q'){
                yeniList.add(girilenIsim);
            }
        }
        System.out.println(yeniList);
        return yeniList;
    }
}
