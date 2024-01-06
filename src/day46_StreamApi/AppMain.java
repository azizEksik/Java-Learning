package day46_StreamApi;

import java.util.List;
import java.util.stream.Stream;

public class AppMain {

    /*
        Java'da Stream'ler, Java 8'de tanıtılan ve koleksiyonlarda (Collections) veri işleme,
        dönüşüm ve filtreleme gibi işlemleri kolaylaştıran bir API'dir.
        Stream API, veri üzerinde işlem yapmayı sağlayan ve işlevsel programlama yaklaşımını destekleyen bir araçtır.

        Stream'ler, verileri işlemek için kullanılırken, veri kaynağından (örneğin, bir liste, dizi veya dosya) veri alır
        ve ardışık bir şekilde işleyerek sonuç üretir.
        Bu işlemler arasında filtreleme, sıralama, eşleştirme (matching), dönüşüm, gruplama ve toplama gibi işlemler yer alır.
     */

    // Stream'i bir akış, data akışları olarak ifade edebiliriz
    // Stream sayesinde Data akışında istediğimiz verileri alıyoruz kendi ihtiyacımız için yoğuruyoruz

    public static void main(String[] args) {

        Stream<String> bosKayit = Stream.empty(); // stream.emty methoduyla bos bir kayıt oluşturduk

        Stream<String> tekKayit = Stream.of("aziz"); // stream.of methodu ile veri ekleyebiliyoruz

        Stream<String> cokluKayit = Stream.of("aziz","ali","mehmet","veli"); // .of ile çoklu veri de ekleyebiliyoruz

        // yukarıdaki Stream'leri yazdırır sak bize referanslarını yazar

        List<String> ogrenciListesi = List.of("aziz","ali","mehmet","veli"); // List'in List.of() methodu ile de kayıt ekleyebiliriz

        Stream<String> ogrencilerStream = ogrenciListesi.stream(); // list'i stream'e cevirdik

        ogrencilerStream.forEach(ogrenci -> System.out.println(ogrenci)); // Stream'den forEach methodunu kullanırsak
                                                                            // Stream'a cevirdigimiz listedeki bütün verileri yazdıra biliriz
        /*
            aziz
            ali
            mehmet
            veli

            forEach methodu bu şekilde yazdırdı
            ogrenci(bu bizim verilere verdigimiz isim) -> syntax'ini kullandık ve yanına da ogrenci variable'ını yazdır dedik
         */







    }

}
