package day15_doWhileLoop_scope;

public class C09_ClassLevelVariable {

    /*
        Bir Class içinde tüm  method'ların erişebileceği varible'lar istenirse
        Class level'da (class'ın içide ama methodların dışında) oluşturulmalıdır

        1- Class Level'da oluşturulan variable'ların scop'u tüm class'tır
        2- Class level'da oluşturulan variable'lara deger atanmasa bile
           Java onlar için tanımlanmış DEFAULT degerler atar
        3- Class Level'da oluşturulan Variable'lar static veya instance(static olmayan) olabilir
        4- static olarak tanımlanan variable'lar tüm method'larda direkt kullanılabilir
        5- method static ise, içerisine static olmayan hiç bir şey almaz
     */

    static int sayi=10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;


    public static void main(String[] args) {
        System.out.println(sayi); //10
        System.out.println("String : " + isim); // non-primiteve türler için  null
        System.out.println("Boolena : " + bl); // flase
        System.out.println("char : " + chr); // '' hiçlik
        System.out.println("int : " + in1); // sayısal türler için 0

        staticMethod();
        // staticOlmayanMethod()
    }

    public static void staticMethod(){

        sayi++;
        System.out.println(sayi); // static
        System.out.println(chr);  // static
        //System.out.println(in2); // instance
        //System.out.println(bl2); // instance
    }

    public void staticOlmayanMethod(){

        sayi--;
        System.out.println(sayi); // static
        System.out.println(bl); // static
        System.out.println(in2); // instance
        System.out.println(bl2); // instance

    }
}
