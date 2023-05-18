package day29_inheritance;

public class C04_Child extends C03_ParentClass{

    int c=20;
    int a;
    String s="Child Class";
    String m;

    public void method1(){
        System.out.println("Child Class method 1");
    }

    public static void main(String[] args) {

        C03_ParentClass objC03 = new C03_ParentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.method1();
        objC03.method2();

        C04_Child objC04= new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1(); // Child Class method 1

        // C04 calss'ını C03'e child yapınca
        // child class'ta olmayıp, parent class'ta olan
        // b, t ve method2() özellik oalrak objC04'e eklendi

        objC04.b=8;
        objC04.t="y";
        objC04.method2(); // Parent method2 çalıştı

        /*
            Java'da parent class'lar child edinmez
            child class'lar parent edinir

            Bir class'ın başka bir class'daki TÜM ÖZELLİKLERİ
            otomatik olarak edinmesini istiyorsak
            class'ımızı extends keyword ile o klasa child yaparız
            (size baba diyebilir miyim // sizi parent yaptım)

            örnek C04_Child Class'ını istediğimiz parent'in child'ı yapmak için;

            C04_Child(class ismimizin önüne) extends(yazarız) C03_ParentClass (ve parantes yapmak istediğimzi class'ı yazarız)

         */

    }

}
