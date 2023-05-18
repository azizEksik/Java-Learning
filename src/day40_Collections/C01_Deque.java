package day40_Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String> dq1= new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]
        dq1.addLast("F"); // [K, B, F]
        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println(dq1.getFirst()); // A // birinci elemti getiren method
        System.out.println(dq1.getLast()); // F // son elementi getiren method

        System.out.println(dq1.remove()); // A // birinci elemti getirip sildi // list boşsa exception fırlatır
        System.out.println(dq1.poll()); //  K // birinci elemti getirip sildi // list boşsa null döner
        System.out.println(dq1.removeLast()); // F // sonuncuyu sildi
        System.out.println(dq1.remove()); // B

        //dq1.remove(); // NoSuchElementException
        System.out.println(dq1.poll()); // null

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.push("F"); // [F, K, B] // Deque'in başına elemnt ekler, eger deque ile ilgili sınırlandırma varsa
                                       // ve yer kalmamışsa IllegalStateException fırlatır

        dq1.pop(); // [K, B] // removeFirst() ile aynı işlevi görür

        System.out.println(dq1.element()); // K // baştaki elementi silmeden bize getirir
                                                // boş  Deque olursa exception fırlatır

        System.out.println(dq1.peek()); // K //ilk elementi bize silmeden getirir, Deque boşsa null dödürür
        System.out.println(dq1.peekLast()); // B

        dq1.offer("C"); // [K, B, C] // sona element ekler
                           // kapasite sınırlıysa, yerleştirirse true döner, yerşeltiremezse false döner

        dq1.offerFirst("M"); // [M, K, B, C]

        System.out.println(dq1);
    }
}
