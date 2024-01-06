package day45_Generic;

public class OrnekGenericMethodOlusturma {

    public <GelenTip1, GelenTip2> void bilgiYaz(GelenTip1 numarasi, GelenTip2 ismi ){

        System.out.println("numara : " + numarasi + " " + "İsmi : " + ismi);

    }

    /*
        yukarıdaki method'da public keyword'ünden sonra <> operatörü koyup içine gelebilecek her türlü data tipini
        kabül edebilsin diye iki adet parametre belirledik. Bu parametrelerin ismini kafamıza göre verdik.
        <> operatörü içinde belirttiğimiz tiplerin aynısını method parametresi olarak da parantez içine yazdık.
        parantez içine hangi deger gelirse gelsin (Integer, String, Boolean, Double...)
        (Sadece calss tipleri, primitive tipler olmaz) methodumuz o değeri kabul edecek.
        oldukça esnek bir method oluşturduk. Bunlara generic method deniyor.
     */
}
