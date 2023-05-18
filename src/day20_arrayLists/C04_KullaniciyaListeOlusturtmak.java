package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        kullaniciyaListOlusturtma();

    }

    public static List<String> kullaniciyaListOlusturtma(){

        Scanner scan=new Scanner(System.in);

        String girilenIsim="aziz";

        List<String>  yeniList=new ArrayList<>();

        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("isim giriniz"+ "\nBitirmek için Q'ya basınız");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                yeniList.add(girilenIsim);
            }
        }
        System.out.println(yeniList);
        return yeniList;
    }
}
