package day30_inheritance;

public class CToyotaCorolla extends BToyota{

    String lastik="Lassa 255-55-15";
    String model="Corolla";
    String yakit="Corolla dizel,benzinli ve elektrikli olabilir";


    public void motor(){
        System.out.println("Corolla araclar turkiyede uretilen motor kullanir");
    }

    public void uretimYeri(){
        System.out.println("Corolla araclar turkiyede uretilir");
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); // bu calsstaki degerini yazdırır
        System.out.println(corolla.model); // bu calsstaki degerini yazdırır
        System.out.println(corolla.yakit); // bu calsstaki degerini yazdırır
        corolla.motor(); // bu calsstaki degerini yazdırır
        corolla.uretimYeri(); // bu calsstaki degerini yazdırır
        System.out.println(corolla.marka); // bu classta olmadığı için parent claas'a(BToyota) gider
        System.out.println(corolla.aku); // bu classta olmadığı için parent claas'a(BToyota) gider
        corolla.guvenlik(); // bu classta olmadığı için parent claas'a(BToyota) gider
        System.out.println(corolla.vites); // bu classta olmadığı için parent claas'a(BToyota) gider,
                                           // orada da bulamazsa bi üst class'a(Araba) daha gider

    }

}
