package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar {

    /*
        Sadece ayrımı belirtmek için
        abstract olmayan class'lara CONCRETE Class denir

        1 - abstract bir class
            parent'i olan abstract class'daki
            abstract method'ları Implement etmek
            zorunda DEGİLDİR

            isterse implement edip, concrete(body'li) hale getirir
            isterse yok sayar

        2 - abstract bir silsileden sonra gelen
            ilk concrete class
            parent veya grandParent olan
            abstract class'larda
            concrete yapilmayan tüm abstract class'ları
            IMPLEMENT ETMEK ZORUNDADIR
     */

    @Override
    public void hareket()
    {

    }
    @Override
    public void beslenme()
    {

    }
    @Override
    public void omur()
    {

    }
}
