package day46_StreamApi;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ornek {

    public static void main(String[] args) {

        Stream<String> myStream = Stream.of("aziz","ali","veli","mehmet","hasan");

        TreeSet<String> myTreeSet = myStream.collect(Collectors.toCollection(TreeSet::new));
        //Bir Stream oluşturduk, string'leri kabul eden
        // sonra bir TreeSet olusturduk
        // yukarıdaki yazım sekli ile Stream'i TreeSet'e aktardık

        System.out.println(myTreeSet); // [ali, aziz, hasan, mehmet, veli]

        System.out.println("============================================");

        Stream<String> myStream2 = Stream.of("aziz","ali","veli","mehmet","hasan");

        myStream2
                .sorted()
                .forEach(isim -> System.out.println(isim));
        // myStream2.sorted() diyerek içerideki elemanları sıraladık
        // sonra .forEach() diyerek Stream'in içindeki sıralanmış elemanları yazdırdık

        System.out.println("============================================");

        Stream<String> myStream3 = Stream.of("aziz","ali","veli","mehmet","hasan","aziz","aziz");

        myStream3
                .distinct()
                .sorted()
                .forEach(isim -> System.out.println(isim));

        //myStream3.distinct() demek duplicate eden elementleri tekil hale getir demek.(yani bir tane olsun)
        // sonra sırala
        // sonra tek tek yazdır

        System.out.println("============================================");

        Stream<String> myStream4 = Stream.of("aziz","ali","veli","mehmet","hasan","aziz","aziz");

        TreeSet<String> myTreeSet4 = myStream4
                .filter(isim -> !(isim.contains("e") || isim.contains("l")))
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(myTreeSet4);

        // yukarıdaki örnekte myStream4 diye bir Stream Oluşturduk ve verileri atadık
        // Sonra bir TreeSet olusturduk
        // olusturdugumuz TreeSet'in içine myStream4'ü attık
        // atmadan önce filter() methodu ile filtreleme yaptık
        // filter methodu içinde isim diye bir variable olsutrduk, bu her bir verimize karşılık gelecek
        // -> lamda syntax'ini kullandık
        // yanına filtre yapacak koşulumuzu yazdık. isiminde e ve l olanları eledik



    }
}
