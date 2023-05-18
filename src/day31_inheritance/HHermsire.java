package day31_inheritance;

public class HHermsire extends FMuhasebe {

    String unvan= "Hemsire";

    protected void standartMaas(){
        System.out.println("Hemsireler minimum 10 bin tl maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir");
    }

    protected void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        HHermsire hemsire= new HHermsire();

        hemsire.method();
    }

    public void method(){

        HHermsire hemsire= new HHermsire();

        System.out.println(hemsire.unvan); // Hemsire
        System.out.println(super.unvan); // personel unvan belirtilmemis // bu sekilde yazarsak (super.unvan)
                                                                         // parent class'daki unvan variable'ını getirir
        System.out.println(this.unvan); // Hemsire // this. dedigimiz için bu class'a bakar
        System.out.println(this.sgkNo); // Calisan sgk no belirtilmedi // önce bu class'a bakar yoksa Parent'a
        System.out.println(super.sgkNo); // Calisan sgk no belirtilmedi
        this.standartMaas(); // 10 bin
        this.fazlaMesai(3); // 600
        super.fazlaMesai(4); // 800
        this.ozelSigorta(); // Hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir
        super.ozelSigorta(); // Personelden katki payi alinarak ozel sigorta yapilir
    }
}
