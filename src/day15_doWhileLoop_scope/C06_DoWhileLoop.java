package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplanmak üzere sayılar alın
        //kullanıcıya bitirmek için  0'a basmasını söyleyin
        //kullanıcı 0'a bastığında sıfır hariç kaç sayı girildiğini ve toplamlarını yazdırın

        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        int sayiAdedi=0;

       /*

       while (girilenSayi!=0){

            System.out.println("toplanmak üzere tamsayı giriniz"+
                    "\nBitirmek için sıfıra basınız");

            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayiAdedi++;
            }
        }

        */

        do {
            System.out.println("toplanmak üzere tamsayı giriniz"+
                    "\nBitirmek için sıfıra basınız");

            girilenSayi= scan.nextInt();

            if (girilenSayi!=0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }

        }while (girilenSayi!=0);

        System.out.println("Girilen "+ sayiAdedi + " adet sayının toplamı : "+ toplam);

    }
}
