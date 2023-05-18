package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim()); // Yildir pazarlama

        C03_EncapsuleDatalar obj= new C03_EncapsuleDatalar();

        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println("Toplam satis : " +obj.toplamSatis); // Toplam satis : 600

    }
}

/*
    C03_EncapsuleDatalar Class'ındaki
    isim variable'ının degeri görünsün ama değiştirilemesin
    satisTutari ise deger girilebilsin ama girilen degerler sonradan görülemesin

    Eger bir variable için read veya write ozelliklerinin
    birbirinden ayrılması isteniyorsa
    öncelikle access modifier ile kimsenin ulaşamamasını sağlayın

    private yaparak kimsenin ulaşamayacağını garantiye aldıktan sonra

    READ yetkisi vermek istediklerimiz için getter()
    WRITE yetkisi vermek istediklerimiz için setter() oluşturmalıyız

 */
