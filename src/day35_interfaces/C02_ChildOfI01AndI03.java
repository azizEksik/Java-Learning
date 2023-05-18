package day35_interfaces;

public class C02_ChildOfI01AndI03 implements I01_Interface,I03_Interface {

    /*
        Interface'in EN ÖNEMLİ ARTISI
        bir class'ın birden fazla interface'i imlement edebilmesidir
        bir class'i extends ile de baska class'a child yapabiliriz

        Ancak birden fazla interface'i imlement ederken
        dikkat etmemiz gereken bir konu vardır

        eger implement etmek istediğimiz farklı interface'lerde
        aynı isimde fakat farklı return type'ı olan methodlar varsa
        iki method'u aynı anda implement edemeyeceğimiz için
        o iki interface'den ancak birini implement edebiliriz
     */

    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {

        C02_ChildOfI01AndI03 obj= new C02_ChildOfI01AndI03();

        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interface.str);

        
    }


}
