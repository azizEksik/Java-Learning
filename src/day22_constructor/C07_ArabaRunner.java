package day22_constructor;

public class C07_ArabaRunner {

    public static void main(String[] args) {

        C06_Araba araba1=new C06_Araba();

        araba1.marka="Toyota";
        araba1.model="Corolla";
        araba1.hasarliMi=false;
        araba1.yil=2017;
        araba1.fiyat=5250;

        // bunları iki şekilde yazdıra biliriz

        // 1. yöntem, tek tek yazma

        System.out.println("Marka : " + araba1.marka + ", " + "Model : " + araba1.model);

        // 2. yöntem, Araba class'ında to string methodu oluşturma

        System.out.println(araba1);

        araba1.yakitTuketimi("Benzin");

        C06_Araba araba2= new C06_Araba("Honda","Jazz",true,2010,3000);

        System.out.println(araba2);

        C06_Araba arab3= new C06_Araba("WV","Jetta",false,2012,7200);

        System.out.println(arab3);
    }
}
