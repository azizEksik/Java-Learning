package day22_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {

    public static void main(String[] args) {

        /*
            Bir obje ancak bir class'dan oluşturulabilir.
            Bir objeyi oluşturduğumuz class, aynı zamanda o objenin data türüdür.

            Her obje oluşturulduğu class'ın özelliklerini taşır

            Eger bir programda, ortak özelliklere sahip
            objeler üretmek üzere tasarladığınız bir class varsa main method olması şart DEGİLDİR
            Bu classlar kaliphane gibi çalışır
            Yani o class'dan aynı özelliklere sahip objeler üretmemizi sağlar
         */

        Scanner scan= new Scanner(System.in);

        List<String> isimler= new ArrayList<>();

        Random rnd= new Random();

        String str= new String("Ali");

        C02_Hemsire hemsire1=new C02_Hemsire();

        System.out.println(hemsire1.mesaiUcretiHesapla(5));

    }
}
