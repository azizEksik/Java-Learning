package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {

    public static void main(String[] args) {

        C03_EncapsuleDatalar obj1= new C03_EncapsuleDatalar();

        System.out.println(obj1.toplamSatis); // read yetkisi

        obj1.toplamSatis=100; // write yetkisi

        // System.out.println(obj1.satisTutari); // read yetkisi

        // obj1.satisTutari=100; // write yetkisi

        /*
            Baska bir Class'daki variable veya method'a ulaşmak istediğimizde

            - ulaşmak istediğimiz class uyesinin static olup olmaması
              erişim yontemini etkiler
              static ise classIsmi.uyeIsmı yazarken
              static degilse obje oluşturup objeIsmi.uyeIsmi

            - Ulaşmak istediğimiz üyenin access modifier'ı ise
              o üyeye ulaşıp ulaşamayacağımızı belirler

              ulaşabilirsek o datayı okuyabilir veya dataya yeni deger atayabiliriz
         */
    }
}
