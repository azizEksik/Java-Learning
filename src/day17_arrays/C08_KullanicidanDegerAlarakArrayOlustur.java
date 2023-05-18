package day17_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {

        // Kullanıcıdan array oluşturmak üzere pozitif tamsayılar sayılar alın
        // kullanıcıya işlemi bitirmesi için 0'a basması gerektiğini söyleyin
        // bir önceki class'dan method kullanarak aldığınız elementleri array'e ekleyin

        Scanner scan= new Scanner(System.in);
        int girilenSayi=1;

        int[] arr=new int[0];

        while (girilenSayi!=0){
            System.out.println("Array oluşturmak üzere pozitif tamsayılar giriniz"+
                    "\nBitirmek istediğinizde 0'a basınız");
            girilenSayi=scan.nextInt();

            if (girilenSayi!=0){
                arr=C07_ArrayElemanEklemeMethodu.arrayeElementEkleme(arr,girilenSayi);
            }
        }

        System.out.println("Yeni oluşturulan array : " + Arrays.toString(arr));
    }
}
