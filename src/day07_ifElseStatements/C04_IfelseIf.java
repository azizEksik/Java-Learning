package day07_ifElseStatements;

import java.util.Scanner;

public class C04_IfelseIf {
    public static void main(String[] args) {

        //-soru- kullanıcıdan mesafeyi kilometre olarak alın ve çevirmek istediği birimi sorun
        //istediği birim metre veya santimetre ise  çevirip yazdırın
        //yoksa istediğiniz birim sisteme kayıtlı değil yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen girmek istediğiniz mesafeyi kilometre cinsinden yazınız");

        double  km = scan.nextDouble();

        System.out.println("Lütfem girdiğiniz mesafeyi çevirmek istediğiniz birimi yazın"
        + "\nSantimetre için : C , Metre için : M yazınız");

        char birim= scan.next().charAt(0);

        if (birim == 'C'){
            System.out.println((km*100000) + " cm");
        } else if (birim == 'M') {
            System.out.println((km*1000) + " m");

        }else {
            System.out.println("İstediğiniz birim siteme kayıtlı değil");
        }

    }
}
