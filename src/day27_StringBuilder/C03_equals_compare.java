package day27_StringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");

        StringBuilder sb2= new StringBuilder("Java");

        String str= "Java";

        // System.out.println(sb1==str);
        // Java'da farklı data türne sahip non-primitive objeler == ile KARŞILAŞTIRILAMAZ

        System.out.println(sb1==sb2); // false

        System.out.println(sb1==sb1); // true

        System.out.println(sb1.equals(sb2)); // false

        /*
            StringBuilder'da içerik aynı olsa bile equals method'u false döner
            Cünkü StringBuilder Class'ında equals() method'u yoktur
            equals() method'unu parent class'ı olan Object Class'ından kullanır
            ve bundan dolayı içeriklere bakmadan false verir

         */

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.equals(sb1)); // true

        // iki StringBuilder'in içeriklerinin ayni olduğunu kontrol etmek için
        // compareTo() methodu kullanılır

        System.out.println(sb1.compareTo(sb2)); // 0

        // System.out.println(sb1.compareTo(str));

        StringBuilder sb3= new StringBuilder("Hava");

        StringBuilder sb4= new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4
        System.out.println(sb4.compareTo(sb3)); // -4


        /*
            compareTo() method'u karsilastirilan StringBuilder'lar aynı metne sahipse 0 döner
            Ayni degilse, basten itibaren kontrole başlar
            farklı olan ilk harfin karsilaştırılan kelimedekiaynı index'teki harften
            kaç harf ileride olduğunu döndürür
         */


    }
}
