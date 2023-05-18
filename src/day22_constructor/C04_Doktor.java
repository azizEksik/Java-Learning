package day22_constructor;

public class C04_Doktor {

    C04_Doktor(){
        System.out.println("parametresiz Constructor calisti");
    }

    String isim ="Isım atanmamis";
    String soyIsim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=30;

    public int mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }
}
