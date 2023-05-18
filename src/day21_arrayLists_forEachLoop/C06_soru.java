package day21_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner  scan= new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String girilenCumle=scan.nextLine();
        System.out.println("Bir harf giriniz");
        char girilenHarf=scan.next().toUpperCase().charAt(0);
        List<Character> cumle=new ArrayList<>();
        girilenCumle=girilenCumle.toUpperCase();


        for (int i = 0; i < girilenCumle.length(); i++) {
            cumle.add(girilenCumle.charAt(i));
        }

        int sayac=0;
        for (Character each: cumle
             ) {
            if (each.equals(girilenHarf)){
                sayac++;
            }
        }
        if (sayac>0){
            System.out.println("Girdiğiniz harf cümlede - " +sayac+" - defa kullanılmıştır" );
        }else {
            System.out.println("Girdiğiniz harf cümlede kullanılmamıştır");
        }


    }
}
