package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        int[]arr=new int[0];

        System.out.println(Arrays.toString(kullanicidanAlinanVerilerleArrayOlusturma(arr)));

    }

    public static int[] kullanicidanAlinanVerilerleArrayOlusturma(int[]array){

        Scanner scan=new Scanner(System.in);
        System.out.println("Oluşturmak istediğiniz arrayin boyutunu giriniz");
        int girilenBoyut= scan.nextInt();
        int girilenSayi=1;
        int[] yeniArray=new int[girilenBoyut];
        int adet=0;
        while (girilenSayi!=0){
            System.out.println("Lütfen elemt giriniz, bitirmek isterseniz 0'a basınız");
            girilenSayi= scan.nextInt();
            yeniArray[yeniArray.length-1-adet]=girilenSayi;
            adet++;
        }
        return yeniArray;
    }
}
