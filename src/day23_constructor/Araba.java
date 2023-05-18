package day23_constructor;

public class Araba {

    int yil;
    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";
    boolean hasarliMi;
    int fiyat;

    @Override
    public String toString() {
        return "Araba bilgileri : " +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat;
    }

    public Araba(int yil, String marka, String model, boolean hasarliMi, int fiyat){
        /*
            Eger parametre ismi instance variable ismi ile AYNI DEGİLSE
            bir alttaki constructor olduğu gibi
            direkt atama yapabiliriz

            Ancak genelde projenin daha anlaşılır olması
            ve doğru variable'ın kullanılması için
            constructor'daki parametre isimleri, instance variable'lar ile ayni seçilir

            Bu durumda Java'ya ayni isimdeki iki variable'dan hangisinin
            Bu class'taki instance variable olduğunu belirtmemiz gerekir.

            Bunun için Java syntax olarak this. yazılmasını istemiştir

            this. yazmazsak Java en kısa şekilde ulaşabileceği variable'ı bulur
         */

        this.yil=yil;
        this.marka=marka;
        this.model=model;
        this.hasarliMi=hasarliMi;
        this.fiyat=fiyat;

    }

    public Araba(int yil, String marka, String model, int fiyat) { // code, generate ile çağırdığımız constructor
        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(){

    }

    public Araba(int fyt, String mrk){
        fiyat=fyt;
        marka=mrk;
    }

    public void yakitTuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin" :
                System.out.println("Benzinli araçlar için yakıt tüketimi: 6 l/100 km");
                break;
            case "Dizel" :
                System.out.println("Benzinli araçlar için yakıt tüketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Benzinli araçlar için yakıt tüketimi: 6 kW/100 km");
                break;
            default:
                System.out.println("geçersiz yakıt türü");
        }

    }

}
