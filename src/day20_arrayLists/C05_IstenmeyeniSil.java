package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        List<String> isimler=C04_KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğiniz bir harf giriniz");
        String girilenHarf= scan.next().substring(0,1);

        System.out.println(istenmeyenHarfIcereniSil(isimler, girilenHarf));

    }

    public static List<String> istenmeyenHarfIcereniSil(List<String> isim, String girilenharf){

        List<String> yeniList=new ArrayList<>();

        for (int i = 0; i < isim.size(); i++) {
            if (!isim.get(i).contains(girilenharf)){
                yeniList.add(isim.get(i));
            }
        }

        return yeniList;

    }
}
