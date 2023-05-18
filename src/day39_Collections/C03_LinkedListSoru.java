package day39_Collections;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {

    static List<Double> notListesi = new LinkedList<>();
    static double ogrenciSayisi;
    static double ogrenciNotOrtalamasi;
    static double ortalamaAltindakiOgrenciSayisi;
    static double ortalama10PuanUst;
    static double ortalama10PuanAlt;

    public static void main(String[] args) {

        //Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
        //bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
        //output hazirlayin
        //not ortalamasi : …..
        //ogrenci sayisi : …..
        //ortalama altindaki ogrenci sayisi : ….
        //ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….


        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notIcinDegerEkleme();
        System.out.println("not listesi : "+notListesi);
        System.out.println("ogrenci sayisi : "+ogrenciSayisi);
        System.out.println("ogrenci not ortalamasi : "+ogrenciNotOrtalamasi);
        System.out.println("ortalam altındaki ogrenci sayisi : " + ortalamaAltindakiOgrenciSayisi);
        System.out.println("ortalamanin 10 puan altindaki ogrenci sayisi : " + ortalama10PuanAlt);
        System.out.println("ortalamanin 10 puan ustundeki ogrenci sayisi : " + ortalama10PuanUst);
    }

    static void notIcinDegerEkleme(){
        Scanner scan;
        boolean tekrar=true;
        double girilenNot;

        while (tekrar){
            scan= new Scanner(System.in);
            System.out.println("Lutfen ogrenci notlarini giriniz \nBitirmek icin Q'ya basiniz");
            try {
                girilenNot= scan.nextDouble();
                if (girilenNot<0){
                    throw new ArithmeticException();
                }
                notListesi.add(girilenNot);
                ogrenciSayisi++;
            }catch (ArithmeticException e){
                System.out.println("Girilen not sıfırdan kucuk olamaz");
            }catch (InputMismatchException e){
                char girilenDeger=scan.next().charAt(0);
                if (girilenDeger=='q' || girilenDeger=='Q'){
                    break;
                }else {
                    System.out.println("Lutfen not olarak pozitif sayisal degerler giriniz");
                }
            }
        }
        double notToplam=0;
        for (int i = 0; i < notListesi.size(); i++) {
            notToplam+=notListesi.get(i);
        }
        ogrenciNotOrtalamasi=notToplam/ogrenciSayisi;

        for (int i=0; i<notListesi.size(); i++){
            if (notListesi.get(i)<ogrenciNotOrtalamasi){
                ortalamaAltindakiOgrenciSayisi++;
            }
            if (notListesi.get(i)<ogrenciNotOrtalamasi-10){
                ortalama10PuanAlt++;
            }
            if (notListesi.get(i)>ogrenciNotOrtalamasi+10){
                ortalama10PuanUst++;
            }
        }

    }
}
