package day23_constructor;

public class C03_StaticKeyWord {

          /*
            1- static variable'lar tüm class için geçerlidir (class variable)
            2- staticc variable'lar tüm objeler için aynı degeri taşıdıkları içi
               her obje için ayrıca oluşturulmaz, sadece bir variable olur
            3- static variable'lara ulaşmak veya update etmek için obje ismi kullanmaya gerek yoktur
               direkt ulaşılabilir
               Baska class'tan satatic variable'a ulaşmak için calssismi.staticVariableIsmi yazılır

         */

    static String hastaneIsmi="Yıldız Hastanesi";
    static String hastaneTelefonu="3122343434";
    static String basHekimIsmi="Kemal Aydin";

    String personeIsmi;
    String personelAdresi;
    String personelTelefonu;


    public static void main(String[] args) {

        C03_StaticKeyWord personel1= new C03_StaticKeyWord();

        System.out.println(personel1.personeIsmi); // null
        System.out.println(hastaneIsmi); // Yıldız Hastanesi
        System.out.println(personel1.basHekimIsmi); // Kemal Aydin

        C03_StaticKeyWord persolen2=new C03_StaticKeyWord();

        persolen2.personeIsmi="Dogan";

        System.out.println(persolen2.personeIsmi); // Dogan
        System.out.println(personel1.personeIsmi); // null


        persolen2.basHekimIsmi="Sumeyra gunel";

        System.out.println(personel1.basHekimIsmi);



    }
}
