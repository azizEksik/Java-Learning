package day40_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {

    public static void main(String[] args) {

        Deque<String> urunler = new LinkedList<>();

        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");

        // Tum ürünlerin başına "Y " ekleyelim

        String eleman="";
        Deque<String> geciciDeque= new LinkedList<>();

        while (eleman!=null){

            eleman = urunler.poll();
            if(eleman!=null){
                eleman = "Y " + eleman;
                geciciDeque.add(eleman);
            }
        }
        urunler=geciciDeque;
        System.out.println(urunler);
    }
}
