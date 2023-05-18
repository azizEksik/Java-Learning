package day24_StatciKeyword;

public class C01_staticBlocks {

    C01_staticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");

        System.out.println("========");

        C01_staticBlocks obj1= new C01_staticBlocks();
    }

    static {
        /*
            static block'lar class ilk calismaya basladiginda calisir
            genel olarak class icin gerekli ön ayarlamaları yapmak için kullanılır

            birden fazla static block varsa
            yukarıdan aşağı doğru sirali oalrak çalışır
         */
        System.out.println("static block calisti");
    }

    static {
        System.out.println("Alttaki static block calisti");
    }

    {
        /*
            static olmayan block'lar ise obje oluşturulurken
            constructor'dan önce çalışır
            obje için yapılması gereken ön ayarlamalar yapmak için kullanılır
         */

        System.out.println("static olmayan block calistti");
    }
}
