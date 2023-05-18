package day35_interfaces;

import java.util.Scanner;

public class C04_Exceptions {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 0;

        //System.out.println(sayi1/sayi2); // ArithmeticException

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi3=scan.nextInt();

        if (sayi3==0){
            System.out.println("0 girmemzsiniz");
        }
        else {
            System.out.println( sayi1/sayi3);
        }
        
    }
}
