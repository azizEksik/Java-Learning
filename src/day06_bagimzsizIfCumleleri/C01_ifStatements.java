package day06_bagimzsizIfCumleleri;

public class C01_ifStatements {

    public static void main(String[] args) {

        /*
        buradaki şartlar birbirinden bagımsızdır
        uygun sayilar olursa 3 if body'si de çalışabilir
        bazen de hiçbir if body'si devreye girmeyebilir
         */


        int a= 13;

        int b= 55;

        if (a>b){
            System.out.println("a b'den büyük");
        }

        if (a%2==0){
            System.out.println("a çift bir sayıdır");
        }

        if (b>100){
            System.out.println("b 100'den büyüktür");
        }

        boolean sonuc= a*7>b;

        /*
        bazen if statement'da derekt boolean bir deger şart olarak yazılabilir
        bu durumda boolean variable true ise if body çalışır
        false ise if body çalışmaz
         */

        if (sonuc){
            System.out.println("istenen şart sağlandı");
        }

        

    }
}
