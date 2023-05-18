package day22_constructor;

public class C02_Hemsire {

        /*
            Örneğin bir hastane programında,
            hastanede çalışacak hemşirelerin hangi bilgilerini tutmak istiyorsak,
            hangi methodları hemşireler için kullanmak istiyorsak
            bir hemşire class'ı oluşturup
            tum bu özellikleri(varable ve methodları) o Class'da ouştururuz

            programda ne zaman bir hemşireye ihtiyaç olsa
            Hemsire Class'ından obje oluştururuz
            böylece otomatik olarak özelliklere(tüm method ve veriable) sahip olur

            eger biz istediğimiz parametlere sahip bir constructor oluşturmazsak
            java class'tan obje oluşturulabilmesi için,
            class'a default bir constructor koyar.

            Default constructor GÖRÜNMEZ,
            parametresi YOKTUR,
            Constructor Body'si BOŞTUR

            C02_Hemsire (){

            }

            Biz de istediğimiz parametrelere sahip,
            istediğimiz kadar constructor oluşturabiliriz

            Cok ONEMLİ : Eger biz bir constructor oluşturursak
                         yani Class'da gözle görünen bir constructor varsa
                         Java default constructor'ı siler
                         Bizim oluşturduğumuz hiçbir constructor'a default constructor DENEMEZ.

         */



    String isim ="Isım atanmamis";
    String soyIsim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;

    public int mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }
}
