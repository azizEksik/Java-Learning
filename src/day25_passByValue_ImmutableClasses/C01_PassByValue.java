package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar); // [3, 4, 5]

        elemntleriArtir(sayilar);

        // elementleri arttir metodunu calistridiktan sonra

        System.out.println("element arttir metodundan sonra : "+sayilar);

        yeniListeAta(sayilar);
        System.out.println("Yeni liste ata metodundan sonra : " +sayilar);

    }

    public static void elemntleriArtir(List<Integer> sayilar){
        // tum lementleri 2 katına cıkaralım


        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,2*sayilar.get(i));
        }

        System.out.println("elemtleri arttir metodunda list : " +sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){

        // sayilar listesine yeni bir list degeri atayıp
        // sonra 1,2,3 elemtlerini ekleyin

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni liste ata methodunda : "+ sayilar);
    }
}
