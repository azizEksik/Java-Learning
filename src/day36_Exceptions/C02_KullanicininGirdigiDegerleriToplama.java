package day36_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {

    public static void main(String[] args) {

        // kullanıcıdan istediği kadar tamsayi alip toplayın
        // kullanıcı q'ya bastığında işlemi sonlandırıp
        // kaç sayi girildiğini ve toplamını yazdirin
        // q veya Q dişinda tam sayi olmayan bir deger girilirse
        // hata mesajı verip yeni deger isteyerek isleme devam edin

        Scanner scan;
        boolean tekrar=true;
        int adet=0;
        int toplam=0;

        while (tekrar){
            scan= new Scanner(System.in);
            System.out.println("Lütfen toplamak icin tamsayilar giriniz"+
                                "\nIslemi bitirmek icin q'ya basiniz");
            try {
                int girilenSayi=scan.nextInt(); // q, Q veya gecersiz baska input girerse exception olusur
                toplam+=girilenSayi;
                adet++;
            }catch (InputMismatchException e){
                char input = scan.next().charAt(0);
                if (input=='q' || input=='Q'){
                    System.out.println("Girilen "+ adet + " adet tamsayinin toplami : " +toplam);
                    break;
                }else {
                    System.out.println("Girilen karakterler tamsayi değil");
                }
            }

        }
        System.out.println("Bu is bu kadar");

    }
}
