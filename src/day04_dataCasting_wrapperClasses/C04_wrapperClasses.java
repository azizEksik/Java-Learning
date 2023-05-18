package day04_dataCasting_wrapperClasses;

import org.w3c.dom.ls.LSOutput;

public class C04_wrapperClasses {
    public static void main(String[] args) {

        //non-primitive turlerinin hazir method'lari varken
        //primitive data türlernin hazir methodlari yoktur
        //Java primitive data türleri için kolyaca geçiş yapabilecekleri non-primitive data türleri oluşturmuştur

        /*
        int ==> Integer
        char ==> Character
        byte ==> Byte
        boolean ==> Boolean

         */

        Integer sayi=10;

        //int variable'aatadığımız değerleri atayabiliyoruz
        //arti olarak hazır methodları var

        //variable oluşturmadan da bazı methodları kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE); // -2147483648

        System.out.println(Integer.MAX_VALUE); // 2147483647

        String sonucStr= "345";

        System.out.println(sonucStr + 10); //34510

        //bu degere 10 ekleyin

        //String'i int e çeviremeyiz. bu durumda devreye wrapper class lar devreye girer

        int sonuc= Integer.valueOf(sonucStr);


        System.out.println(sonuc + 10); //355

        sonuc= Integer.parseInt(sonucStr);

        System.out.println(sonuc + 10); //355


        //string dosyasını istersek Integer.valueOf(); ya da Integer.parseInt(); ile int dosyasına çevirebiliriz
        



    }
}
