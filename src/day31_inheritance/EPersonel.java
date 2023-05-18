package day31_inheritance;

public class EPersonel {

    protected String isim="personel isim belirtilmemis";
    protected String unvan="personel unvan belirtilmemis";
    protected boolean izindeMi;

    protected void standartMaas(){
        System.out.println("Personel asgari ucreti : "+ 8500);
    }

    protected void ozelSigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir");
    }
}
