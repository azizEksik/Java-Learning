package day35_interfaces;

public interface I01_Interface {

    int sayi=10;

    final String str ="Java Candir";

    public static final boolean b= true;

    // Interface'de tüm variable'ler (yazilmasa bile) public, static, ve final'dır
    // final olduğu için sonradan değiştirme imkanı yoktur, oluşturuken deger atanmalıdır
    // bu özellikler standart olarak tum variable'lara tanimlandığından,
    // bu tanımlamaları yapmak gerkli değildir (intellij gri yaptı)

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    // tum method'lar da standart olarak public ve abstract'tır (yazılamsa bile)

}
