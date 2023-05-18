package day39_Collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> ll1= new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface'i implement etmiştir
        // List, Queue, Deque interface'leri
        // Dolayısıyla bu interface'lerden sonra gelen ilk concrete class olduğundan
        // Bu 3 interface'deki tüm abstract method'ları override etmiştir

        // LinkedList oluşturulurken seçilen data türüne göre
        // bu üç interface'den birinin özelliklerini alabilir
        // veya data türü LinkedList seçilirse, 3 interface'in özelliklerini de toptan alir

        List<String> ll2 = new LinkedList<>();

        // Daha önceden ArrayList oluşturuken, list<> inteface'ini data turu olarak kullandıgımızdan
        // bu şekilde oluşturulan LinkedList'lerin özelliklerini biliyoruz

        ll2.add("R"); // [R]
        ll2.add("Z"); // [R, Z]
        ll2.add(0,"A"); // [A, R, Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z]

        ll2.set(3,"M"); // [A, R, K, M, Z]

        System.out.println(ll2.get(1)); // R

        ll2.add("K");
        ll2.add("T");

        System.out.println(ll2); // [A, R, K, M, Z, K, T]

        System.out.println(ll2.retainAll(ll1)); // ture

        System.out.println(ll2); // [K, K, T]

        System.out.println(ll2.hashCode()); // 104275 // hafızada tuttuğu haskodun yerini veriyor




    }
}
