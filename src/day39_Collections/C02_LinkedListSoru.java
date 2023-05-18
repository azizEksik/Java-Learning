package day39_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {

    public static void main(String[] args) {

        //Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi
        //birakmak icin 0’a basmalidir.
        //Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        //liste1 : …….
        //liste2 : …….
        //ortak elementler : …….


        System.out.println("Once list1'i olusturalim");
        List<String> list1= kullanicidanAlarakListOlustur();
        System.out.println("Simdi ikinci listeyi olusturalim");
        List<String> list2=kullanicidanAlarakListOlustur();

        System.out.println("Liste1 : " + list1);
        System.out.println("Liste2 : " + list2);

        list1.retainAll(list2); // ortak element için  kullandığımız method

        System.out.println("Ortak elementler : " +  list1);

    }

    public static List<String> kullanicidanAlarakListOlustur(){

        List<String> isimListesi= new LinkedList<>();
        Scanner scan= new Scanner(System.in);
        while (true){
            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");
            String girilenIsim= scan.nextLine();
            if (girilenIsim.equalsIgnoreCase("0")){
                break;
            }else {
                isimListesi.add(girilenIsim);
            }
        }
        return isimListesi;
    }
}
