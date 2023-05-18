package day22_constructor;

public class C03_HemsireRunner {
    public static void main(String[] args) {

        C02_Hemsire hemsire1= new C02_Hemsire();
        /*
            bir obje oluştururken parametre olarak hiç bir deger girilmezse
            oluşturulan obje, oluşturulduğu class'daki variable'lara atanan degerleri alır
            eger obje oluşturulan class'da deger ataması yoksa, java default degerleri atar
         */

        System.out.println(hemsire1.isim); // Isım atanmamis
        System.out.println(hemsire1.evliMi); // hiçlik
        System.out.println(hemsire1.yas); // 0
        System.out.println(hemsire1.izindeMi); // false

        hemsire1.isim="tuba";
        hemsire1.yas=29;

        System.out.println(hemsire1.isim); // tuba
        System.out.println(hemsire1.yas); // 29
    }
}
