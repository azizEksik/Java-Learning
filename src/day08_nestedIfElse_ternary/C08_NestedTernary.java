package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C08_NestedTernary {
    public static void main(String[] args) {

        //soru- Kullanıcıdan bir tamsayı alın
        // sayı pozitif ise çift sayı veya çift sayı değil seçeneklerinden uygun  olanı yazdırın
        // sayı pozitif değilse , 3 basamaklı veya  3 basamaklı değil seçeneklerinden uygun olanı yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");

        int sayi= scan.nextInt();

        System.out.println((sayi>0) ? (sayi%2==0 ? "Çift Sayı": "Çift Sayı Değil")
                                    : (sayi<=-100 && sayi>=-999 ? "3 Basamaklı" : "3 Basamaklı Değil" ));




    }
}
