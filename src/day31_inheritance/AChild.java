package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {

    String childStr;

    AChild(){
        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) {

        // System.out.println(childStr); static degil
        // System.out.println(sayiParent); static degil

        AChild objeChild= new AChild();

        /*
            Java'da inheritance kullanirken
            child class'taki obje parent class(lar)'daki tüm özelliklere sahip olur
            bunu sağlayan Java mekanizması super() constructor call'dur.

            Extend keyword kullanan bir class'da
            oluşturulan her bir constructor'ın ilk satırında
            biz görmesek bile super() constructor call vardır
            super() ==> önce parent class'a gidip oradaki parametresiz constructor'ı calistir demektir

            bu şekilde child class'taki constructor calistiginda
            extend keyword kullanmayan parent buluncaya kadar
            parent class'lara gider.
         */
    }


}
