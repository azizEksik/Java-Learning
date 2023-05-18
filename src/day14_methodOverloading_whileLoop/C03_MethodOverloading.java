package day14_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        /*
        Bir class'ta aynı isme sahip farklı işlem yapan method'lar olabilir
        Java bu method'lardan hangisinin çalışacağına parametrelere  göre karar verir

        Bir class'ta ismi aynı parametreleri farklı method'lar olmasına
        Method OVERLOADING denir.
         */

        String str= "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel"));

        System.out.println(str.replace('u', 'e'));

    }
}
