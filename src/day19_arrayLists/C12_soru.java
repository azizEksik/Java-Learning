package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_soru {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
        //bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int girilenSayi=scan.nextInt();

        System.out.println(tamSayidanKucukFibonacciDizisi(girilenSayi)); // girilenSayi = 10 // [0, 1, 1, 2, 3, 5, 8]


    }

    public static List<Integer> tamSayidanKucukFibonacciDizisi(int girilenSayi){

        List<Integer> FibonacciList=new ArrayList<>();

        List<Integer> yeniFibonacciList=new ArrayList<>();

        if (girilenSayi==0){
            System.out.println(FibonacciList);
        } else if (girilenSayi==1) {
            FibonacciList.add(0);
            System.out.println(FibonacciList);
        } else if (girilenSayi==2) {
            FibonacciList.add(0);
            FibonacciList.add(1);
            FibonacciList.add(1);
            System.out.println(yeniFibonacciList);
        }
        if (girilenSayi>2){

            int ilkSayi=0;
            FibonacciList.add(ilkSayi);
            int ikinciSayi=1;
            FibonacciList.add(ikinciSayi);
            int yeniSayi=ilkSayi+ikinciSayi;
            FibonacciList.add(yeniSayi);

            while (FibonacciList.size()<girilenSayi){
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                FibonacciList.add(yeniSayi);
            }
        }
        for (int i = 0; i < FibonacciList.size(); i++) {
            if (FibonacciList.get(i)<girilenSayi){
                yeniFibonacciList.add(FibonacciList.get(i));
            }
        }
        return yeniFibonacciList;
    }
}
