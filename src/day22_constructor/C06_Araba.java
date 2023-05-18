package day22_constructor;

public class C06_Araba {

    /*

        bir obje oluşturulurken
        default constructor veya parametresiz görünür constructor kullanılırsa
        obje ilk atanan degerlere sahip olur
        istediğimiz degerleri atamak için tek tek tüm varible'lara
        atama yapmamız gerekir


        Bunun yerine;


       atamak istediğimiz degerler parametre olarak constructor'a yollayalım
       ve atamaları constructor içinde yapalım
     */

    public C06_Araba (String mrk, String mdl, boolean hmi, int yl, int fyt){
        yil=yl;
        marka=mrk;
        model=mdl;
        fiyat=fyt;
        hasarliMi=hmi;
    }

    public C06_Araba(){

    }


    @Override
    public String toString() {
        return "Araba özellikleri{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    int yil;
    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";
    boolean hasarliMi;
    int fiyat;

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
