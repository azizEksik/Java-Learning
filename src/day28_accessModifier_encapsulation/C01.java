package day28_accessModifier_encapsulation;

public class C01 {

    String str; // Class level'daki her Class üyesinin Access modifier'ı olur
                // eger Access modifier görünmüyorsa Java o Class üyesini default Access modifier  olarak işaretler

    static String s;
    private int b;
    private static int c;
    public static int a;
    public int d;



    public static void main(String[] args) {

        int sayi=10;

        //private int c;

        //protected int f;

        // public int sayi2=20;

        // static String b;

        // Bir method içerisinde public, protected, private gibi Access modifier'lar
        // veya static keyword KULLANILAMAZ

        //System.out.println(b);

        System.out.println(c);

    }

    void method1(){
        System.out.println(b);

        System.out.println(c);
    }

    static void method2(){

    }

    public void method3(){

    }


}
