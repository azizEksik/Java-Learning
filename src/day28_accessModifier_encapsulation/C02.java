package day28_accessModifier_encapsulation;

public class C02 {

    public static void main(String[] args) {

        C01 obj= new C01();

        // System.out.println(obj.b); access modifier'ı private
        // System.out.println(obj.c); access modifier'ı private

        obj.str= "tava";
        C01.s = "Tava";

        C01.a=50;
        obj.d=40;
    }
}
