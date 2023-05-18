package day32_inheritance_dataTypeKullanimi;

public class HAvciKuslar extends GKuslar {

    public void hareket()
    {
        System.out.println("Ucarlar");
    }
    public void beslenme()
    {
        System.out.println("Et yerler");
    }
    public void pence()
    {
        System.out.println("Pencelidir");
    }
    public void gaga()
    {
        System.out.println("Sivri gagalı");
    }

    public static void main(String[] args)
    {
        HAvciKuslar kartalAvci= new HAvciKuslar();

        kartalAvci.hareket(); // H Class Ucarlar
        kartalAvci.beslenme(); // H Class Et yerler
        kartalAvci.pence(); // H Class Pencelidir
        kartalAvci.gaga(); // H Class Sivri gagali

        kartalAvci.kanat(); // G Class Kanatlidir
        kartalAvci.solunum(); // G Class Akcigerle nefes alirlar
        kartalAvci.cogalma(); // G Class Yumurtayla cogalirlar

        kartalAvci.omur(); // F Class Yasar ve  olurler

        System.out.println("==============================");

        GKuslar kuslar = new GKuslar();

        kuslar.hareket(); // F Class Hareket ederler
        kuslar.beslenme(); // F Class Beslenirler
        // kuslar.pence(); // CTE
        kuslar.gaga(); // G Class Gagalari vardir

        kuslar.kanat(); // G Class Kanatlidir
        kuslar.solunum(); // G Class Akcigerle nefes alirlar
        kuslar.cogalma(); // G Class Yumurtayla cogalirlar

        kuslar.omur(); // F Class Yasar ve  olurler

        System.out.println("=================================");

        GKuslar kartalKus= new HAvciKuslar();

        kartalKus.hareket(); // H Class Ucarlar
        kartalKus.beslenme(); // H Class Et yerler
        // kartalKus.pence(); // CTE
        kartalKus.gaga(); // H Class Sivri gagali

        kartalKus.kanat(); // G Class Kanatlidir
        kartalKus.solunum(); // G Class Akcigerle nefes alirlar
        kartalKus.cogalma(); // G Class Yumurtayla cogalirlar

        kartalKus.omur(); // F Class Yasar ve  olurler

        System.out.println("=================================");

        FHayvanlar hayvanlar=  new FHayvanlar();

        hayvanlar.hareket(); // F Class Hareket ederler
        hayvanlar.beslenme(); // F Class Beslenirler
        // hayvanlar.pence(); // CTE
        // hayvanlar.gaga(); // CTE

        // hayvanlar.kanat(); // CTE
        hayvanlar.solunum(); // F Class Nefes alirlar
        hayvanlar.cogalma(); // F Class Cogalirlar

        hayvanlar.omur(); // F Class Yasar ve  olurler

        System.out.println("===================================");

        FHayvanlar kartalHayvan = new HAvciKuslar();

        kartalHayvan.hareket(); // H Class Ucarlar
        kartalHayvan.beslenme(); // H Class Et yerler
        // kartalHayvan.pence(); // CTE
        // kartalHayvan.gaga(); // CTE

        // kartalHayvan.kanat(); // CTE
        kartalHayvan.solunum(); // G Class Akcigerle nefes alirlar
        kartalHayvan.cogalma(); // G Class Yumurtayla cogalirlar

        kartalHayvan.omur(); // F Class Yasar ve  olurler

        /*
            Ozellikler method olarak oluşturulmuş ise

            Data türü ve constructor AYNI ise
            o class'da aramaya başlarım
            bulduğum ilk degeri kullanırım

            Data türü ve constructor FARKLI ise

            data türü olan class'dan aramaya başlar

            o class veya parent class'larında
            bulamazsa CTE verir

            o class veya parent class'larında
            bulursa, override edilmis mi kontrol eder
            ve en güncel bilgiyi bulup yazdırır


         */
    }
}
