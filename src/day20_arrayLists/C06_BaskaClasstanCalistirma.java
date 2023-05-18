package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalistirma {
    public static void main(String[] args) {

        // C05'deki istenmeyenlerisil methodunu buradan kullanalım

        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Cikolatalı Gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenHarf="o";

        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcereniSil(urunler, "o")); // [Nutella]

        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcereniSil(urunler, "a")); // [Cokoprens, Cokomel]
    }
}
