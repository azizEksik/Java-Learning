package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C02_soru {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=1;
        int toplam=0;
        int adet=-1;

        while (girilenSayi!=0){
            System.out.println("Lütfen toplanmak üzer pozitif  tamsayılar giriniz, işlemi bitirmek için 0'a basınız");
            girilenSayi=scan.nextInt();
            if (girilenSayi<0){
                System.out.println("negatif sayı kullanamazsınız");

            }else {
                toplam+=girilenSayi;
                adet++;
            }

        }
        System.out.println("girilen sayı adedi : " +  adet + "\nGirilen sayıların toplamı : " +toplam);



    }
}
