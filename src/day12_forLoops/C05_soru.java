package day12_forLoops;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir pozitif başlangıç değeri girin");

        int baslangic= scan.nextInt();

        System.out.println("Lütfen bir pozitif bitiş değeri girin");

        int bitis= scan.nextInt();

        int  sayilartoplami=0;

        if (baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {

                sayilartoplami+=i;

            }
        }else {
            for (int i = baslangic; i >=bitis ; i--) {

                sayilartoplami+=i;

            }
        }

        System.out.println("Sayılar toplamı : " + sayilartoplami);

    }
}
