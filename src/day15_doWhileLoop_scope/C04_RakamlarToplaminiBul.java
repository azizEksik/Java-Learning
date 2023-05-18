package day15_doWhileLoop_scope;

public class C04_RakamlarToplaminiBul {

    // verilen pozitif bir tamsayının
    // rakamlar toplamını bize dödüren bir method oluşturun

    public static int rakalarToplaminiBul(int verilenSayi){

        int sayi=verilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int basamakSayisi=  (sayi+"").length();

        for (int i = 1; i <=basamakSayisi ; i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        return rakamlarToplami;
    }
}
