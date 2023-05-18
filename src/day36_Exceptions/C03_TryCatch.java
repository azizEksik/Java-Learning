package day36_Exceptions;

public class C03_TryCatch {

    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=0;

        try{
            System.out.println(sayi1/sayi2); // burada bir hata olursa, catch bloguna kadar diger kodlar calismaz
            System.out.println("deneme1");
            System.out.println("deneme2");
            System.out.println("deneme3");
        }catch (ArithmeticException e){
            System.out.println("bölen 0 olmamalı");
        }

        /*
            bir try nlogunda exception olusursa
            o satırdan catch satırına kadar aradaki tüm kodlar IGNORE(görmezden gelinir) edilir

            eger try blogunda exception olusmazsa
            catch devreye girmez
            (if - else gibi)
         */

    }
}
