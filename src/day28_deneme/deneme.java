package day28_deneme;

import day28_accessModifier_encapsulation.C01;

public class deneme {

    public static void main(String[] args) {

        C01 obj= new C01();

        // obj.str="Fava"; farklı package'da olduğumuz default access modifier'lı str'ı çağıramıyoruz

        // C01.s="Fava"; farklı package'da olduğumuz default access modifier'lı str'ı çağıramıyoruz

        // obj.b=10; private access modifier

        obj.d=30;
        C01.a=40;
    }
}
