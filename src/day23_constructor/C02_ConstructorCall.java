package day23_constructor;

import java.util.SortedMap;

public class C02_ConstructorCall {

    /*
        Java'da ihtiyaç olursa bir constructor içinden başka constructor cagrilabilir
        this(ilgili parametreler); yazarak istediğimiz constructor'u çağırabiliriz

        Constructor call için iki kural vardır
        1- constructor call içinde bulunduğu constructor'ın ilk satırında olmalıdır
        2-
     */

    int sayi;
    String str;

    public C02_ConstructorCall() {
        System.out.println("Parametresiz constructor çalıştı");
    }
    public C02_ConstructorCall(int sayi){
        System.out.println("int parametreli constructor çalıştı");
        this.sayi=sayi;
    }
    public C02_ConstructorCall(String str){
        this(5);
        System.out.println("String parametreli constructor çalıştı");
        this.str=str;
    }
    public C02_ConstructorCall(int sayi, String str){

      //  C02_ConstructorCall(); boyle yazildiginda method call olarak algılar

        this(); // Java syntax olarak constructor call için bunu belirlemiştir
        this.sayi=sayi;
        this.str="Java";
        System.out.println("iki parametreli constructo çalıştı");
    }

    public static void main(String[] args) {

       C02_ConstructorCall obj3= new C02_ConstructorCall(7,"Selçuk"); // Parametresiz constructor çalıştı
                                                                              //  iki parametreli constructo çalıştı
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java

        /*

        C02_ConstructorCall obj2= new C02_ConstructorCall("Java");  //int parametreli constructor çalıştı
                                                                    // String parametreli constructor çalıştı
        System.out.println(obj2.sayi); // 5
        System.out.println(obj2.str); // Java

        // C02_ConstructorCall obj1= new C02_ConstructorCall();

         */

    }

}
