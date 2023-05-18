package day39_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataturu {

    public static void main(String[] args) {

        Queue<String> q1= new LinkedList<>();

        //Queue eklemeyi sonradan yapar silmeyi baştan yapar. araya eleman ekleyemeyiz

        q1.add("H");
        q1.add("Y"); // [H, Y]

        q1.offer("K"); // [H, Y, K]
        // kapasite sinirlamasi yapılmadığı sürece add() ile aynı işlemi yapar

        q1.remove(); // [Y, K] // Queue eklemeyi sona yapıp, kullanmayı baştan patığı için
                     // parametre girmediğimizde bastaki elemanı remove ader ve bize döndürür

        System.out.println(q1.remove("K")); // true

        q1.poll(); // remove gibi siler, ama remove bos Queue listesinde çalıştırılırsa exception fırlatır.
                   // poll() ise null dönderir. ayrıca poll baştaki elementi siler

        q1.add("H");
        q1.add("Y");

        System.out.println(q1.peek()); // H // silemeden Queue'nin başındaki elemnti bize getirir
                                       // eger Queue bos ise bize null getirir

        System.out.println(q1.element()); // peek ile aynı şeyi yapar.
                                          // sadece bos Queque ile karşılaşırsa exception fırlatır

        System.out.println(q1);
    }
}
