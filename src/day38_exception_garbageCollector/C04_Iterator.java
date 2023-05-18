package day38_exception_garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {

    public static void main(String[] args) {

        /*
            Java'da Collections konusunda ogreneceğimiz Set gibi bazı yapılar index desteklemez

            Bu durumda index olmadığından elementleri yazdırmak istersek
            for - each loop kullanabiliriz
            Ama elementler arasında dolaşmak, belirli şartları sağlayanlari
            update etmek isterseniz, for - each loop ile yapamazsınız

            Hatta List'de istenmeyen elemtleri silmek istediğimizde
            her sildiğimiz element uzunluğu değiştirdiği için
            kodlar sağlıklı çalışmaz

            Bu sorunları çözmek için Java Iterator interface'ini oluşturmuştur.

         */

        List<Integer>  sayilar = new ArrayList<>();

        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        for (int i = 0; i < sayilar.size(); i++) {

            if (sayilar.get(i)%2==0){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);
    }
}
