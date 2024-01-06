package day45_Generic;

public class SinifSinirlandirma <T1 extends Number, T2 extends String> {

    /*
        yukarıdaki class isimlendirmesinde <> sınırlandırma kullandık
        T1 ve T2 iki adında iki adet deger belirledik.(bu degerler içine bütün class tiplerini alabilir)
        T1'i number class'ina extend ettik ki sadece number kabul etsin(Integer,Double,Long...)
        T2'yi de String class'ina extend ettik. T1 ve T2 sayesinde bu class'a iki ade tip göderebiliriz.
        Bu class'i Generic hale getirdik
     */


    public <E1 extends Number, E2 extends String> void bilgiYaz(E1 deger1, E2 deger2){

        /*
            Bu method'da dışarıdan deger olarak iki parametre istedik
            Birinci degerimizin sayi tipinde olabilmesini garanti etmek istedik
            Bu yüzde method'da <> operatörüyle bir sınırlama getirdik
            E1 degerini Number Class'ina extend ettik. Bu sayede E1 parametresinin sadece sayi kabul etmesini sağladık
            (Double,Integer,Short,Byte,Long...)
            E2 degerini String class'ina extend ederek E2 parametresini sadece String class'ina bağlı class'lardan deger almasını sağladık
         */
    }




}
