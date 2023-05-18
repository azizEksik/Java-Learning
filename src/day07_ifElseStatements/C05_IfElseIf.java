package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        //kullanıcıdan kilo(kg) ve boyunu(cm) isteyip vücut kitle endeksini hesaplayın
        //(kilo*10000 / (boy*boy)) vücut kitle nedeksi otuzdan büyükse obez, 25-30 arası ise
        //kilolu, 20-25 arası ise normal, 20'den küçükse zayıf yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen kilonuzu KG cinsinden yazınız");
        
        double  kilo= scan.nextDouble();

        System.out.println("Lütfen boyunuzu CM cinsinden yazınız");
        
        double boy= scan.nextDouble();

        double endeks= (kilo*10000 /(boy*boy));
        
        if (endeks>30){
            System.out.println("Vücut kitle endeksiniz : " + endeks + "\nObez" );
        } else if (endeks<=30 && endeks>=25) {
            System.out.println("Vücut kitle endeksiniz : " + endeks + "\nKilolu");
            
        } else if (endeks<=25 && endeks >=20) {
            System.out.println("Vücut kitle endeksiniz : " + endeks + "\nNormal");

        }else {
            System.out.println("Vücut kitle endeksiniz : " + endeks + "\nZayıf");
        }


    }
}
