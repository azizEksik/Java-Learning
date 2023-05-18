package day12_forLoops;

import java.util.Scanner;

public class C09_soru {

    public static void main(String[] args) {

        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //tamsayilari yazdirin, sira
        //- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //yazdirin


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir pozitif tamsayı giriniz");

        int tamsayi= scan.nextInt();

        for (int i = 1; i <=tamsayi ; i++) {

            if (i%3==0){
                String a=Integer.toString(i);
                a="fizz";
                System.out.print(a+" ");
            }
            if (i%5==0){
                String b=Integer.toString(i);
                b="buzz";

                System.out.print(b + " ");
            }

            if (i%3==0 && i%5==0){
                String c=Integer.toString(i);
                c="fizzBuzz";

                System.out.print(c + " ");
            }

            if (i%3!=0 && i%5!=0 && i%15!=0){
                System.out.print(i +" ");
            }



        }



    }
}
