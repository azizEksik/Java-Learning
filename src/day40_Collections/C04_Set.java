package day40_Collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    public static void main(String[] args) {

        Set<Integer> sayilar= new HashSet<>();

        sayilar.add(12);
        sayilar.add(15);

        Set<Integer> siraliSet= new TreeSet<>();

        siraliSet.add(23);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);

        System.out.println(siraliSet); // [12, 15, 23, 34] // rastgele eklesek de TreeSet sıralı yazdırır

        // bir hasSet ve bir TreeSet oluşturalım
        // ikisine de random 1000 tane sayi ekleyip
        // islem sürelerini kıyaslayalım



        Set<Integer> hst= new HashSet<>();

        LocalTime sure1= LocalTime.now();
        for (int i = 0; i < 8000; i++) {
            Random rnd1= new Random();
            int randomsayi=rnd1.nextInt(100000);
            hst.add(randomsayi);
        }
        LocalTime sure2 = LocalTime.now();



        Set<Integer> tst = new TreeSet<>();

        LocalTime sure3= LocalTime.now();
        for (int i = 0; i < 8000; i++) {
            Random rnd1= new Random();
            int randomsayi=rnd1.nextInt(100000);
            tst.add(randomsayi);
        }
        LocalTime sure4= LocalTime.now();
        System.out.println("HashSet Gecen süre : " + (sure2.getNano()-sure1.getNano()));
        System.out.println("TreeSet Gecen süre : " + (sure4.getNano()-sure3.getNano()));

        

    }
}
