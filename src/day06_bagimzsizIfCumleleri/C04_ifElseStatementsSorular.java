package day06_bagimzsizIfCumleleri;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C04_ifElseStatementsSorular {
    public static void main(String[] args) {

        //soru-1- kullanıcıdan bir üçgenin üç kenar uzunlugunu alın
        //ucgen eskenar ise "eskenar üçgen yazdırın" değilse, "eskenar üçgen değil" yazdırın

        /*
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen üç adet kenar uzunluğu giriniz");

        double kenar1= scan.nextDouble();
        double kenra2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenra2 && kenar1==kenar3){
            System.out.println("Eşkenar üçgen");
        }else {
            System.out.println("Eşkenar üçgen değil");
        }

         */


        //soru-2- kullanicidan yaşını isteyin, 65 yaş ve üzeri ise"Emekli olabilirsin" yazdırın
        //yoksa emekli olması için çalışması gereken yıl sayısını yazdırın

        /*
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");

        double yas= scan.nextDouble();
        double yas2=65;

        if (yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }else{
            System.out.println("Emekli olabilmeniz için çalışmanız gereken yıl : "+ (yas2-yas));
        }

         */

        // soru - kullanicidan bir karakter girmesini isteyin,
        //girilen karakterin büyük harf olup olmadığını yazdırın

        /*Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir karakter girin");

        char krk= scan.next().charAt(0);

        if ('A'<= krk && krk <= 'Z'){
            System.out.println("Girilen karakter büyük harf");
        }else {
            System.out.println("Girilen karakter büyük harf değil");
        }

         */


        // soru - Kullanıcıdan bir harf isteyin girilen karakter küçük harf ise onu büyük harf olarak yazdırın
        // yoksa girilen harfi yazdırın


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz");

        char harf= scan.next().charAt(0);

        if ('a'<=harf && harf <= 'z'){
            System.out.println(Character.toUpperCase(harf)); // Character.toUpperCase() küçük harfi büyük harfe çevirir
        }else{
            System.out.println(harf);
        }

    }
}
