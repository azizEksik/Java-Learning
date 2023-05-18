package day33_polimorphizm;

public class BChild extends AParent{

    @Override
    void method1() {
       // super.method1(); // java kendi oluşturmuştu, yoruma aldım
        // Burada super. olursa hem child class'taki method1
        // hem de super(parent) class'daki method 1 çalışır
    }
    void method2()
    {
        /*
            bir method Override edildiğinde
            child class'da @Override notasyonu KULLANILABİLİR

            kullanmak veya kulllanmamak arasında
            pratikte şöyle bir sonuç oluşur.

            eger notasyon kullanılırsa
            iki method arasındaki ilişki takip edilir
            parent class'taki method silinirse
            notasyon CTE verir

            notasyon yoksa
            parent class'daki overrriden method silinirse
            bir uyarı verilmez, CTE oluşmaz
         */
    }

    Integer method3()
    {
        /*
        Overriden method ile overriding methodun
        isim ve signature'leri aynı olmalıdır

        return type ve access modifier
        signature'a dahil değildir
        ancak overriding de bunlarla ilgili de kurallar vardır

        1- access modifier kurali :
           child parent'ı kısıtlayamaz

           eger overridden ve overriding methodları
           private yaparsak
           bu iki method BAĞIMSIZ OLARAK çalışır
           aralarında override işlemi olmaz
        2- Return type kurali :
           return type primitive veya void ise
           iki methodu return type'ı AYNI OLMALIDIR

           non-primitive oldugunda
           ya aynı olmalı
           veya parent class'daki return type
           child class'daki return Type'ın parnt'ı OLMALI
         */
        return 5;
    }
}
