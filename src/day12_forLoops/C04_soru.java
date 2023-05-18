package day12_forLoops;

import java.util.Scanner;

public class C04_soru {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir pozitif başlangıç değeri girin");

        int baslangic= scan.nextInt();

        System.out.println("Lütfen bir pozitif bitiş değeri girin");

        int bitis= scan.nextInt();

        int  sayilartoplami=0;

        if (baslangic>bitis){
            System.out.println("uyarı");
        }else {

            for (int i = baslangic; i <=bitis ; i++) {

                sayilartoplami +=i;


            }
        }

        System.out.println("SAyıların toplamı : " + sayilartoplami);

    }
}
