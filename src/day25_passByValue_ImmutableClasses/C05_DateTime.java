package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args){

        LocalTime saat= LocalTime.now();
        System.out.println(saat); // şu anki zamanı verir

        System.out.println(saat.getNano()); // nano saniyeyi veren method

        // bir loop ile 1 den 10bin'e kadar olan sayılari toplayın
        // ve bu işlemin kaç nano saniye sürdüğünü bulun

        int toplam=0;

        int baslamaSuresiNano= saat.getNano();

       for(int i = 1; i <=10000; i++){
           toplam+=i;
       }

       LocalTime bitisSaat=LocalTime.now();
       int bitisSuresiNano= bitisSaat.getNano();

        System.out.println("islem süresi : " +(bitisSuresiNano-baslamaSuresiNano));
    }
}
