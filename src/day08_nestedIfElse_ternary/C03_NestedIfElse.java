package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        //soru- Kullanıcıdan aldığı ürün adedi ve liste fiyatını alın
        //Kullanıcıya müşteri kartı olup olmadığını sorun
        //Müşteri kartı varsa 10 üründen fazla alırsa %20, yoksa %15 indirim yapın
        //Müşteri kartı yoksa 10  üründen fazla alırsa %15, yoksa %10 indirim yapın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen aldığınız ürün adedini yazınız");

        int urunadedi= scan.nextInt();

        System.out.println("Lütfen aldığınız ürünlerin liste fiyatını yazınız");

        double listefiyati= scan.nextDouble();

        System.out.println("Müşteri kartınız var mı?" + "\n Varsa : V, Yoksa : Y yazınız");

        char kart=scan.next().charAt(0);

        if (kart=='V'){
            if (urunadedi>10){
                System.out.println("Aldığınız ürünlerin indirimli fiyatı : " + (listefiyati-((listefiyati*20)/100)));
            }else {
                System.out.println("Aldığınız ürünlerin indirimli fiyatı : " + (listefiyati-((listefiyati*15)/100)));
            }
        } else if (kart=='Y') {
            if (urunadedi>10){
                System.out.println("Aldığınız ürünlerin indirimli fiyatı : " + (listefiyati-((listefiyati*15)/100)));
            }else {
                System.out.println("Aldığınız ürünlerin indirimli fiyatı : " + (listefiyati-((listefiyati*10)/100)));
            }

        }else {
            System.out.println("Müşteri kartını hatalı girdiniz, lütfen tekrar deneyiniz");
        }

    }
}
