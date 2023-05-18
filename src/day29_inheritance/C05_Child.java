package day29_inheritance;

public class C05_Child extends C03_ParentClass{

    int c=20;
    int a;
    String s="Child Class";
    String m;

    public void method1(){
        System.out.println("Child Class method 1");
    }

    public static void main(String[] args){

        // child calss'tan bir obje oluşturalım ve özelliklerini yazdıralım

        C05_Child obj= new C05_Child();

        System.out.println(obj.a); // 0 // bu calss'ta a variable'ı varsa onun degerini alır
                                        // yoksa parent class'a gider ve oradaki a degerini alır
        System.out.println(obj.c); // 20 // bu class
        System.out.println(obj.b); // 0 // parent class // çünkü b bu classta yok
        System.out.println(obj.m); // null // bu class
        System.out.println(obj.s); // Child Class // bu class
        System.out.println(obj.t); // null // parent  class

        obj.method1(); // Child Class method 1 // bu class
        obj.method2(); // Parent method2 çalıştı // parent class

    }
}
