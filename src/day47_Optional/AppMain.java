package day47_Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppMain {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();

        ogrenci = null;

        /*
            yuakrıda ogrenci objesine null atadık, kabul etti
            AMA ogrenci class'inda primitive data tipi var
            Ve primitive data türleri null kabul emez
            System.out.println(ogrenci) eğer bu şekilde ogrenci objesini yazdırırsam
            prugram null pointer exception atar ve çöker, çünkü ogrenci class'inda primitve data tipi var null alamaz

         */

        /**
         Java'da Optional sınıfı, Java 8'de tanıtılan bir sınıftır.
         Bu sınıf, bir değerin var olup olmadığını belirtmek için kullanılır
         ve genellikle bir metotun dönüş değeri olarak veya
         bir nesnenin değerini içeren bir değişken olarak kullanılır.

         Optional sınıfı, bir değerin var olup olmadığını belirtirken
         null referanslarının potansiyel risklerini azaltmaya yardımcı olur.
         Bir nesne üzerinde çalışırken null kontrolü yapmak zorunda kalmamızı engelleyerek
         NullPointerException'ların (NPE) olasılığını azaltır.

         Optional sınıfının temel avantajları şunlardır:

         Null kontrolü: Bir nesnenin null olup olmadığını kontrol etmeden önce
         Optional kullanarak işlem yapabilirsiniz.
         Bu, kodunuzu daha güvenli hale getirebilir.

         Daha açık ve okunabilir kod: Optional, bir değerin var olup olmadığını açıkça belirtir.
         Bu, kodunuzu daha okunabilir ve anlaşılabilir hale getirebilir.

         Null yerine varsayılan değerler: get() metodunu kullanarak Optional içinde bir değer varsa
         bu değeri alabilir veya yoksa varsayılan bir değer döndürebilirsiniz.

         AŞAĞIDA BUNUN ORNEGİNİ YAPTIK

         */

        Optional<Double> ortalama1 = ortalamaHesapla();

        System.out.println(ortalama1); // Optional.empty yazdırdı // parametreli metoda boş parametre girsek bile çalıştı


        Optional<Double> ortalama2 = ortalamaHesapla(15,0.2,22,33.4,45,27);

        System.out.println(ortalama2); // Optional[23.766666666666666]

        if (ortalama2.isPresent()){
            // ortalama2.isPresent() eğer ortalamada deger varsa
            System.out.println(ortalama2.get()); // 23.766666666666666 // get methodu ile cagirirsak bize sadece degeri getirir
            // ortalamada deger varsa optional'ın get() methodunu kullanabiliriz
            // eğer deger yoksa ve kullanırsa porgram exception atar
        }else {
            // eğer ortalamada deger yoksa yani boşsa
            // get() methodunu kullanmadan bu şekilde yazdırmalıyız

            System.out.println("henüz sınav yapılmadı");
        }
        /*
            Yukarıda ortalam diye bir method çağırdık ama bize ne döneceğini bilmiyoruz
            null dönebilir
            porgramlarda null birçok riski de beraberinde getirir
            biz De null kontrolü yapabilmek için optional<> kullandık
            Amacımız NullPointerException Riskini AZALTMAK
         */

    }

    private static Optional<Double> ortalamaHesapla(double... notlar) {

        // kullanıcının ne kadar not girecegini bilmedigimiz için parantez içine (...) üç nokta
        // yani sonsuzluk operatörünü kullandık, artık kullanıcı istedigi kadar sayi girebilir

        if (notlar.length == 0){

            return Optional.empty();
            // eger girilen notların sayısı 0'a eşitse yani hiç not girilmediyse
            // optional'a boş deger dönder

        }else {
            double notlarinToplami = 0;
            int notSayisi = notlar.length;

            for (int i = 0; i < notlar.length; i++) {
                notlarinToplami += notlar[i];

            }

            return Optional.of(notlarinToplami/notSayisi); // Optional.of() methodu ile gelene degeri dönderdik
        }

    }

}
