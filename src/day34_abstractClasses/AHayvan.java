package day34_abstractClasses;

public abstract class AHayvan {

    /*
        bir class'ı abstract class yapmak için deklerasyona
        abstract kewword'unu yazmak yeterlidir.

        Abstract class'lar class oldukları için constructor'ları vardır
        ama abstract class'lardan obje oluşturulamaz

        Abstract class'larda bugüne kadar kullandığımız yapıda
        method'lar oluşturabiliriz ancak bunlar child class'lar tarafından
        uyarlanmak(override) zorunda olmaz

        Child class'ları uyarlamaya mecbur etmek istediğimiz method'ları da
        abstract yapmalıyız

        bir method'u abstract yapmak için
        declaration'ina abstract yazmamız yeterlidir
     */
    public abstract void hareket();

    public abstract void solunum();

    public abstract void beslenme();

    public abstract void cogalma();

    public abstract void omur();

}
