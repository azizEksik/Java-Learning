package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

    String hareket  = "Avci kuslar => Ucarlar";
    String beslenme = "Avci kuslar => Et yerler";
    String pence    = "Avci kuslar => Pencelidir";
    String gaga     = "Avci kuslar => Sivri gagali";

    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();

        System.out.println(kartalAvci.hareket); // Avci kuslar => Ucarlar
        System.out.println(kartalAvci.beslenme); // Avci kuslar => Et yerler
        System.out.println(kartalAvci.pence); // Avci kuslar => Pencelidir
        System.out.println(kartalAvci.gaga); // Avci kuslar => Sivri gagali

        System.out.println(kartalAvci.kanat); // Kuslar => Kanatlidirlar
        System.out.println(kartalAvci.solunum); // Kuslar => Akcigerle nefes alirlar
        System.out.println(kartalAvci.cogalma); // Kuslar => Yumurtayla cogalirlar

        System.out.println(kartalAvci.omur); // Hayvanlar => Yasar ve olurler

        System.out.println("========================");

        BKuslar kartalKus= new CAvciKuslar();
        // Kuslar class'ındaki Kartalın özellikleri

        System.out.println(kartalKus.hareket); // Hayvanlar => Hareket ederler
        System.out.println(kartalKus.beslenme); // Hayvanlar => Beslenirler
        // System.out.println(kartalKus.pence); // CTE
        System.out.println(kartalKus.gaga); // Kuslar => Gagalari vardir

        System.out.println(kartalKus.kanat); // Kuslar => Kanatlidirlar
        System.out.println(kartalKus.solunum); // Kuslar => Akcigerle nefes alirlar
        System.out.println(kartalKus.cogalma); // Kuslar => Yumurtayla cogalirlar

        System.out.println(kartalKus.omur); // Hayvanlar => Yasar ve olurler

        System.out.println("===========================");

        AHayvanlar kartalHayvan= new CAvciKuslar();

        System.out.println(kartalHayvan.hareket); // Hayvanlar => Hareket ederler
        System.out.println(kartalHayvan.beslenme); // Hayvanlar => Beslenirler
        // System.out.println(kartalHayvan.pence); // CTE
        // System.out.println(kartalHayvan.gaga); // CTE

        // System.out.println(kartalHayvan.kanat); // CTE
        System.out.println(kartalHayvan.solunum); // Hayvanlar => Nefes alirlar
        System.out.println(kartalHayvan.cogalma); // Hayvanlar => Cogalirlar

        System.out.println(kartalHayvan.omur); // Hayvanlar => Yasar ve olurler

        // Variable olarak özellikleri oluşturursak
        BKuslar kuslar=new BKuslar();
        BKuslar avciKuslar=new CAvciKuslar();
        // Bu iki obje arasında bir fark göremeyiz

        /*
            Eger bir obje olusturulurken
            Data türü ve constructor aynı ise
            aradıgımız ozellikler için direkt o class'a gider
            ve ozellikleri ararız

            Eger data turu ve constructor farklı ise
            variable ve method'lar farklı davranırlar

            variable'lar
            - once data türünün oldugu class'a bakar
              o variable'ı bulursa degerini yazdırır
              bulamazsa data türünün parant'larına bakar
              orada bulursa degerini yazdırır
              orada da bulamazsa CTE verir

            Ozetle bir ozelligi variable olarak oluşturursanız
            data türü olan class ve parent'larındaki ortak özelliklere bakar

            ortak bilgileri arar,
            en güncel bilgiyi aramaz
         */

    }
}
